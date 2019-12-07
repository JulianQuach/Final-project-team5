package Exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game {

	final static int NUMBER_OF_QUESTIONS = 20;

	static List<Character> answers = new ArrayList<Character>();

	static List<Question> listOfQuestions = new ArrayList<Question>();

	final static int totalSecond = 600;

	static Thread t1;
	static Thread t2;

	static boolean end = false;

	public static void welcomeStatement() {
		System.out.println(
				"Welcome to the Quiz! \nThere are 20 questions in total. \nThere are 4 options for every question but only one correct answer. "
						+ "\nPlease choose your answer wisely from option A, B, C or D."
						+ "\nYou have to answer 17 of them correctly to win the game." + "\nLet the game begin!\n");
	}

	public static void takeAnswer(int currentQuestion) {
		Scanner keyboard = new Scanner(System.in);
		String userResponse = keyboard.nextLine();

		while (!userResponse.equalsIgnoreCase("A") && !userResponse.equalsIgnoreCase("B")
				&& !userResponse.equalsIgnoreCase("C") && !userResponse.equalsIgnoreCase("D")) {
			System.out.println("Please enter a VALID answer.");
			userResponse = keyboard.nextLine();
		}
		answers.add(userResponse.charAt(0));
		if (totalCorrectIncorrect()[1] >= 4) {
			end = true;
		}
	}

	public static void showTestResults() {
		System.out.println("\n\nYou got " + totalCorrectIncorrect()[0] + " correct answers and "
				+ totalCorrectIncorrect()[1] + " incorrect answers.");

		if (!passed()) {
			System.out.print("You got these questions wrong: ");
			for (int index = 0; index < questionsMissed().length; index++) {
				if (questionsMissed()[index] != 0) {
					System.out.print(questionsMissed()[index]);
				}
				if (index != questionsMissed().length-1) {
					System.out.print(", ");
				}
			}
		}
		if (passed()) {
			System.out.println("\nHurray! You Won!");
		} else {
			System.out.println("\nSorry, you lost the game. Please try again later!");
		}
	}

	public static void readFile(String fileName) throws IOException {
		File file = new File(System.getProperty("user.dir") + "\\" + fileName);
		String st;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) {
				listOfQuestions.add(new Question(st, br.readLine(), br.readLine(), br.readLine(), br.readLine(),
						br.readLine().charAt(0)));
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void CategorySelection() throws IOException {
		System.out.println("Please select from the following categories:");
		System.out.println("1. Science");
		System.out.println("2. Road Rules");
		System.out.println("3. General Knowledge");
		System.out.println("4. Stupid Question");
		Scanner keyboard = new Scanner(System.in);
		int userResponse = keyboard.nextInt();
		while (userResponse != 1 && userResponse != 2 && userResponse != 3 && userResponse != 4) {
			System.out.println("Please enter a number from 1 to 4.");
			userResponse = keyboard.nextInt();
		}

		if (userResponse == 1) {
			readFile("Science.txt");
		}
		if (userResponse == 2) {
			readFile("RoadRules.txt");
		}
		if (userResponse == 3) {
			readFile("GeneralKnowledge.txt");
		}
		if (userResponse == 4) {
			readFile("StupidQuestion.txt");
		}
	}

	public static Runnable RandomQuestionGenerator() {
		Collections.shuffle(listOfQuestions);
		for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
			if (end) {
				break;
			}
			System.out.println("Question " + (i + 1) + ": " + listOfQuestions.get(i).toString1());
			takeAnswer(i);
			System.out.println();
		}
		return null;
	}

	public static int[] totalCorrectIncorrect() {
		int totalCorrectAnswers = 0;
		int incorrectAnswers = 0;
		for (int index = 0; index < answers.size(); index++) {
			if (listOfQuestions.get(index).checkAnswer(answers.get(index))) {
				totalCorrectAnswers = totalCorrectAnswers + 1;
			} else {
				incorrectAnswers = incorrectAnswers + 1;
			}
		}
		int[] answers = new int[2];
		answers[0] = totalCorrectAnswers;
		answers[1] = incorrectAnswers;
		return answers;
	}

	public static boolean passed() {
		int passingScore = 17;

		if (totalCorrectIncorrect()[0] >= passingScore) {
			return true;
		}
		return false;
	}

	public static int[] questionsMissed() {
		int[] questionsMissedArray = new int[answers.size()];
		int questionsMissedArrayIndex = 0;

		for (int index = 0; index < answers.size(); index++) {
			if (!listOfQuestions.get(index).checkAnswer(answers.get(index))) {
				questionsMissedArray[questionsMissedArrayIndex] = index + 1;
				questionsMissedArrayIndex++;
			}
		}
		return questionsMissedArray;
	}

	public static void startGame(int totalSeconds) {
		GameTimer gt = new GameTimer(totalSeconds);
		t1 = new Thread(gt.run());
		t2 = new Thread(RandomQuestionGenerator());
		t1.start();
		t2.start();
	}

	public static void endGame() {
		t1.interrupt();
		end = true;
	}

	public static void main(String[] args) throws IOException {
		welcomeStatement();
		CategorySelection();
		startGame(totalSecond);
		showTestResults();
	}

}