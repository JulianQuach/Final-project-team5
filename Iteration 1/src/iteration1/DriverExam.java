//package iteration1;
//
//public class DriverExam {
//	private String [ ] correctAnswers = {"A", "D", "A", "D", "C",
//										 "D", "C", "D", "D", "C",
//			                             "D", "D", "C", "A", "D",
//			                             "B", "A", "C", "B", "D"};
//	
//	private String [ ] studentAnswers;
//	private int numberOfQuestions = correctAnswers.length;
//	
//	public int totalCorrect() {
//		int totalCorrectAnswers = 0;
//		
//		for( int index =0; index < numberOfQuestions; index++ ) {
//			if( this.correctAnswers[index].equalsIgnoreCase( studentAnswers[index] ) ) {
//				totalCorrectAnswers = totalCorrectAnswers + 1;
//		}
//		
//		}
//	return totalCorrectAnswers;
//	}
//	
//	public int totalInCorrect() {
//		int  incorrectAnswers = 0;
//		
//		for( int index =0; index < numberOfQuestions; index++ ) {
//			if( !(correctAnswers[index].equalsIgnoreCase( studentAnswers[index]) ) ) {
//				incorrectAnswers = incorrectAnswers + 1;
//		}
//		
//		}
//	return incorrectAnswers;
//	}
//	
//	public boolean passed() {
//		int passingScore = 17;
//	
//		if( totalCorrect() >= passingScore) {
//			return true;
//		}
//		return false;
//	}
//	
//	public int [ ] questionsMissed() {
//		int [ ] questionsMissedArray = new  int [ numberOfQuestions ]; 
//		int questionsMissedArrayIndex = 0;
//		
//		for( int index =0; index < numberOfQuestions; index++ ) {
//			if( !(correctAnswers[index].equalsIgnoreCase( studentAnswers[index]) ) ) {
//				questionsMissedArray[ questionsMissedArrayIndex ] = index + 1;
//				questionsMissedArrayIndex++;
//			}
//		}
//		return questionsMissedArray;
//	}	
//	
//	public DriverExam( String[] studentArrayGiven) {
//		studentAnswers = studentArrayGiven;
//	}
//}
