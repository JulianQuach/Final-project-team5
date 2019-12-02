package iteration1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DriverExamTest {

	final static int NUMBER_OF_QUESTIONS = 20;

	static char[] studentAnswers = new char[NUMBER_OF_QUESTIONS];

	static List<Question> listOfQuestions = new ArrayList<Question>();

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
		studentAnswers[currentQuestion] = userResponse.charAt(0);
	}

	public static void showTestResults() {
		System.out.println("\n\nYou got " + totalCorrectIncorrect()[0] + " correct answers and "
				+ totalCorrectIncorrect()[1] + " incorrect answers.");

		if (!passed()) {
			System.out.print("You got these questions wrong: ");
			for (int index = 0; index < questionsMissed().length; index++) {
				if (questionsMissed()[index] != 0) {
					System.out.print(questionsMissed()[index] + ", ");
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

	public static void RandomQuestionGenerator() {
		Collections.shuffle(listOfQuestions);
		for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
			System.out.println("Question " + (i + 1) + ": " + listOfQuestions.get(i).toString1());
			takeAnswer(i);
			System.out.println();
		}
	}

	public static int[] totalCorrectIncorrect() {
		int totalCorrectAnswers = 0;
		int incorrectAnswers = 0;
		for (int index = 0; index < NUMBER_OF_QUESTIONS; index++) {
			if (listOfQuestions.get(index).checkAnswer(studentAnswers[index])) {
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
		int[] questionsMissedArray = new int[NUMBER_OF_QUESTIONS];
		int questionsMissedArrayIndex = 0;

		for (int index = 0; index < NUMBER_OF_QUESTIONS; index++) {
			if (!listOfQuestions.get(index).checkAnswer(studentAnswers[index])) {
				questionsMissedArray[questionsMissedArrayIndex] = index + 1;
				questionsMissedArrayIndex++;
			}
		}
		return questionsMissedArray;
	}
	
	public static void main(String[] args) throws IOException {
		welcomeStatement();
		CategorySelection();
		RandomQuestionGenerator();
		showTestResults();
	}

}
