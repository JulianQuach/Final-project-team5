package iteration1;

public class Question {
	private String question;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private char answer;
	
	public Question(String question, String a1, String a2, String a3, String a4, char a) {
		this.question = question;
		answer1 = a1;
		answer2 = a2;
		answer3 = a3;
		answer4 = a4;
		answer = a;
	}
	
	public boolean checkAnswer(char a) {
		if (a == answer) {
			return true;
		}
		return false;
	}
	
	public String toString1() {
		String s = question + "\n";
		s = s.concat("A. " + answer1 + "\n");
		s = s.concat("B. " + answer2 + "\n");
		s = s.concat("C. " + answer3 + "\n");
		s = s.concat("D. " + answer4 + "\n");
		return s;
	}
}
