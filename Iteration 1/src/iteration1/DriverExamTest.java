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

	public static void fillStudentAnswersArray(String[] studentAnswers) {

		System.out.println(
				"Welcome to the Quiz! \nThere are 20 questions in total. \nThere are 4 options for every question but only one correct answer. "
						+ "\nPlease choose your answer wisely from option A, B, C or D."
						+ "\nYou have to answer 17 of them correctly to win the game." + "\nLet the game begin!\n");

		String userResponse;

		listOfQuestions.add(new Question("Drinking alcohol while taking drugs can:",
				"have a more pronounced effect than either taken separately.",
				"have less pronounced effect than either taken separately.", "improve your driving performance.",
				"improves concentration.", 'A'));

		listOfQuestions.add(new Question("A steady yellow light at an intersection means:", "Yield to other vehicles.",
				"Immediately come to a complete stop.", "Proceed with caution through the intersection.",
				"Slow down and be prepared to stop.", 'D'));

		listOfQuestions.add(new Question("ABS is the acronym for:", "Anti-Locking Brake System.",
				"Anti-Braking System.", "Average-Beam System.", "Anti-Buzz-Steering.", 'A'));

		listOfQuestions.add(new Question("Your ability to drive safely can be impaired by:", "alcohol.",
				"drugs, even if they are over-the-counter.", "lack of sleep.", "All of the Above.", 'D'));

		listOfQuestions.add(new Question("Warning signs normally are:", "triangles.", "diamond-shaped.", "rectangles.",
				"octagons.", 'C'));

		listOfQuestions.add(new Question("If your vehicles starts to hydroplane you should:",
				"maintain your current speed to gain better traction.",
				"apply the brakes firmly to prevent your vehices from sliding.",
				"slow down gradually and do not apply the brakes.", "All of the above.", 'D'));

		listOfQuestions.add(new Question("Drivers often fail to see a motorcycle headed toward them. Why?:",
				"It is hard to judge how far away a motorcycle is.", "It is difficult to judge a motorcycle's speed.",
				"Motorcycles are hard to see.", "All of the above.", 'C'));

		listOfQuestions.add(new Question("When an aggressive driver confronts you, you should:",
				"Report aggressive drivers to law enforcement authorities.", "Try to move away safely.",
				"Remain calm and relaxed.", "All of the above.", 'D'));

		listOfQuestions.add(new Question("___________ normally are white rectangles with black letters or symbols:",
				"Warning signs.", "Destination signs (guide signs).", "Service signs.",
				"Regulation signs (regulatory signs).", 'D'));

		listOfQuestions.add(new Question("When you reach an intersection with a stop sign, you should:",
				"stop, look right, then left, then right again.",
				"Check your rearview mirror, look left, then right, then proceed.",
				"Stop, look left, then right, then left again.", "Follow the vehicle ahead of you.", 'C'));

		listOfQuestions.add(new Question("An aggressive driver:", "Competes with other traffic.",
				"Shows little or no respect for traffic laws.", "Weaves in and out of traffic.", "All of the above.",
				'D'));

		listOfQuestions
				.add(new Question("Drivers may pass another vehicle if the line dividing two lanes is a ________ line:",
						"Solid yellow.", "solid white.", "double solid yellow.", "broken white.", 'D'));

		listOfQuestions
				.add(new Question("When you are driving, turning your head and looking before changing lanes is:",
						"prohibited.", "A bad driving habit.", "A good driving habit.",
						"Unnecessary, you should use your rearview mirror instead.", 'C'));

		listOfQuestions.add(new Question("If you suddenly have no control of the steering wheel, you should:",
				"ease your foot off the gas pedal. Turn on your emergency flashers and allow your vehicle to come to a slow stop.",
				"Pump your brake pedal to build pressure.", "Turn on your emergency flashers and pull off the road.",
				"React as you would with a blowout.", 'A'));

		listOfQuestions.add(new Question("Do not pass:", "when school bus lights are flashing.", "On hills or curves.",
				"When approaching intersections.", "All of the above.", 'D'));

		listOfQuestions.add(new Question(
				"In heavy rain, tires can begin to ride on the water that is on top of the road pavement. This is called:",
				"pavement-planing.", "Hydroplaning.", "Rideplaning.", "Waterplaning.", 'B'));

		listOfQuestions.add(new Question("Which shape is a speed limit sign?", "Vertical rectangle.", "Diamond.",
				"Pentagon.", "Round.", 'A'));

		listOfQuestions.add(
				new Question("More than one vehicle is approaching a four-way stop sign. Who has the right of way?",
						"The driver on the left.", "The last driver to reach the intersection.",
						"The first driver to reach the intersection and stop.", "No one.", 'C'));

		listOfQuestions
				.add(new Question("When you see an emergency vehicle with flashing lights behind you, you should:",
						"disregard the signal if there are other lanes available for the emergency vehicle.",
						"slow down, provide a clear path for the emergency vehicle and stop.",
						"immediately come to a complete stop.",
						"keep moving slowly, staying to the right side of the road.", 'B'));

		listOfQuestions.add(new Question("When changing lanes, you can check your blind spot by:",
				"using the inside rearview mirror.", "checking the rearview and outside mirrors.",
				"using the outside rearview mirror.", "turning your head and glancing over your shoulder.", 'D'));

		for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
			System.out.println("Question " + (i + 1) + ": " + listOfQuestions.get(i).toString1());
			takeAnswer(i);
			System.out.println();
		}
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
		CategorySelection();
		RandomQuestionGenerator();
		showTestResults();
	}

}
