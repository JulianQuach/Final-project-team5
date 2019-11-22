package iteration1;

import java.util.Scanner;

public class DriverExamTest {
	
	public static void fillStudentAnswersArray(String [ ] studentAnswers ) {
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Welcome to the Quiz! \nThere are 20 questions in total. \nThere are 4 options for every question but only one correct answer. "
				+ "\nPlease choose your answer wisely from option A, B, C or D."
				+ "\nYou have to answer 17 of them correctly to win the game."
				+ "\nLet the game begin!");
		
		
			String userResponse;
			
			System.out.println("\n \n1. Drinking alcohol while taking drugs can:"
					+ "\n A. have a more pronounced effect than either taken separately."
					+ "\n B. have less pronounced effect than either taken separately."
					+ "\n C. improve your driving performance."
					+ "\n D. improves concentration.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[0] = userResponse;
			
			
			System.out.println("\n\n 2. A steady yellow light at an intersection means:"
					+ "\n A. Yield to other vehicles."
					+ "\n B. Immediately come to a complete stop."
					+ "\n C. Proceed with caution through the intersection."
					+ "\n D. Slow down and be prepared to stop.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[1] = userResponse;
		
			
			System.out.println("\n \n3. ABS is the acronym for:"
					+ "\n A. Anti-Locking Brake System."
					+ "\n B. Anti-Braking System."
					+ "\n C. Average-Beam System."
					+ "\n D. Anti-Buzz-Steering.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[2] = userResponse;
			
			System.out.println("\n \n4. Your ability to drive safely can be impaired by:"
					+ "\n A. alcohol."
					+ "\n B. drugs, even if they are over-the-counter."
					+ "\n C. lack of sleep."
					+ "\n D. All of the Above.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[3] = userResponse;
			
			System.out.println("\n \n5. Warning signs normally are:"
					+ "\n A. triangles."
					+ "\n B. diamond-shaped."
					+ "\n C. rectangles."
					+ "\n D. octagons.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[4] = userResponse;
			
			System.out.println("\n \n6. If your vehicles starts to hydroplane you should:"
					+ "\n A. maintain your current speed to gain better traction."
					+ "\n B. apply the brakes firmly to prevent your vehices from sliding."
					+ "\n C. slow down gradually and do not apply the brakes."
					+ "\n D. All of the above.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[5] = userResponse;
			
			System.out.println("\n \n7. Drivers often fail to see a motorcycle headed toward them. Why?:"
					+ "\n A. It is hard to judge how far away a motorcycle is."
					+ "\n B. It is difficult to judge a motorcycle's speed."
					+ "\n C. Motorcycles are hard to see."
					+ "\n D. All of the above.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[6] = userResponse;
			
			System.out.println("\n \n8. When an aggressive driver confronts you, you should:"
					+ "\n A. Report aggressive drivers to law enforcement authorities."
					+ "\n B. Try to move away safely."
					+ "\n C. Remain calm and relaxed."
					+ "\n D. All of the above.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[7] = userResponse;
			
			System.out.println("\n \n9. ___________ normally are white rectangles with black letters or symbols:"
					+ "\n A. Warning signs."
					+ "\n B. Destination signs (guide signs)."
					+ "\n C. Service signs."
					+ "\n D. Regulation signs (regulatory signs).\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[8] = userResponse;
			
			System.out.println("\n \n10. When you reach an intersection with a stop sign, you should:"
					+ "\n A. stop, look right, then left, then right again."
					+ "\n B. Check your rearview mirror, look left, then right, then proceed."
					+ "\n C. Stop, look left, then right, then left again."
					+ "\n D. Follow the vehicle ahead of you.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[9] = userResponse;
			
			System.out.println("\n \n11. An aggressive driver:"
					+ "\n A. competes with other traffic."
					+ "\n B. Shows little or no respect for traffic laws."
					+ "\n C. Weaves in and out of traffic."
					+ "\n D. All of the above.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[10] = userResponse;
			
			System.out.println("\n \n12. Drivers may pass another vehicle if the line dividing two lanes is a ________ line:"
					+ "\n A. Solid yellow."
					+ "\n B. solid white."
					+ "\n C. double solid yellow."
					+ "\n D. broken white.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[11] = userResponse;
			
			System.out.println("\n \n13. When you are driving, turning your head and looking before changing lanes is:"
					+ "\n A. prohibited."
					+ "\n B. A bad driving habit."
					+ "\n C. A good driving habit."
					+ "\n D. Unnecessary, you should use your rearview mirror instead.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[12] = userResponse;
			
			System.out.println("\n \n14. If you suddenly have no control of the steering wheel, you should:"
					+ "\n A. ease your foot off the gas pedal. Turn on your emergency flashers and allow your vehicle to come to a slow stop."
					+ "\n B. Pump your brake pedal to build pressure."
					+ "\n C. Turn on your emergency flashers and pull off the road."
					+ "\n D. React as you would with a blowout.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[13] = userResponse;
			
			System.out.println("\n \n15. Do not pass:"
					+ "\n A. when school bus lights are flashing."
					+ "\n B. On hills or curves."
					+ "\n C. When approaching intersections."
					+ "\n D. All of the above.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[14] = userResponse;
			
			System.out.println("\n \n16. In heavy rain, tires can begin to ride on the water that is on top of the road pavement. This is called:"
					+ "\n A. pavement-planing."
					+ "\n B. Hydroplaning."
					+ "\n C. Rideplaning."
					+ "\n D. Waterplaning.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[15] = userResponse;
			
			System.out.println("\n \n17. Which shape is a speed limit sign?"
					+ "\n A. Vertical rectangle."
					+ "\n B. Diamond."
					+ "\n C. Pentagon."
					+ "\n D. Round.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[16] = userResponse;
			
			System.out.println("\n \n18. More than one vehicle is approaching a four-way stop sign. Who has the right of way?"
					+ "\n A. The driver on the left."
					+ "\n B. The last driver to reach the intersection."
					+ "\n C. The first driver to reach the intersection and stop."
					+ "\n D. No one.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[17] = userResponse;
			
			System.out.println("\n \n19. When you see an emergency vehicle with flashing lights behind you, you should:"
					+ "\n A. disregard the signal if there are other lanes available for the emergency vehicle."
					+ "\n B. slow down, provide a clear path for the emergency vehicle and stop."
					+ "\n C. immediately come to a complete stop."
					+ "\n D. keep moving slowly, staying to the right side of the road.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[18] = userResponse;
			
			System.out.println("\n \n20. When changing lanes, you can check your blind spot by:"
					+ "\n A. using the inside rearview mirror."
					+ "\n B. checking the rearview and outside mirrors."
					+ "\n C. using the outside rearview mirror."
					+ "\n D. turning your head and glancing over your shoulder.\n");
			userResponse = keyboard.nextLine();
			
			while( !userResponse.equalsIgnoreCase( "A" ) && !userResponse.equalsIgnoreCase( "B" ) && 
					!userResponse.equalsIgnoreCase( "C" ) && !userResponse.equalsIgnoreCase( "D" )) {
				System.out.println("Please enter a VALID answer.");
				userResponse = keyboard.nextLine();
			}
			studentAnswers[19] = userResponse;
	}
	
	
	public static void showTestResults( DriverExam driverExamObject ) {
		System.out.println("\n\nYou got " + driverExamObject.totalCorrect() + " correct answers and " + 
							driverExamObject.totalInCorrect()+ " incorrect answers.");
		
		if(!(driverExamObject.passed())) {
		System.out.print("These questions were wrong: ");
		for(int index = 0; index < driverExamObject.questionsMissed().length; index++) {
			if(driverExamObject.questionsMissed()[ index ] !=0 ) {
				System.out.print( driverExamObject.questionsMissed()[ index ]+ " ");
			}
		}
		}
		if(driverExamObject.passed()) {
			System.out.println("\nHurray! You Won!");
		} else {
			System.out.println("\nSorry, you lost the game. Please try again later!");
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

