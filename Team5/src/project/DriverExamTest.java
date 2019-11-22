package project;
import java.util.Scanner;

public class DriverExamTest {
	
	public static void fillStudentAnswersArray(String [ ] studentAnswers ) {
		Scanner keyboard = new Scanner(System.in);
		
		for ( int index = 0; index < studentAnswers.length; index++ ) {
			String userResponse;
			
			System.out.println("Answer for question " + (index + 1));
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("VALID Answer for question " + (index + 1));
				userResponse = keyboard.nextLine();
			}
			studentAnswers[index] = userResponse;
	}
	}
	
	public static void showTestResults( DriverExam driverExamObject ) {
		System.out.println("You got " + driverExamObject.totalCorrect() + " correct answers and " + 
							driverExamObject.totalInCorrect()+ " incorrect answers.");
		
		System.out.println("You missed questions ");
		for(int index = 0; index < driverExamObject.questionsMissed().length; index++) {
			if(driverExamObject.questionsMissed()[ index ] !=0 ) {
				System.out.print( driverExamObject.questionsMissed()[ index ]+ " ");
			}
		}
		if(driverExamObject.passed()) {
			System.out.println("You passed");
		} else {
			System.out.println("You failed");
		}
	}
	
	public static void main (String [] args) {
		final int NUMBER_OF_QUESTIONS = 20;
		
		String [] studentAnswers = new String [NUMBER_OF_QUESTIONS];
		
		fillStudentAnswersArray( studentAnswers);
		
		DriverExam drivingTest = new DriverExam( studentAnswers );
		
		showTestResults( drivingTest );
	}

}
