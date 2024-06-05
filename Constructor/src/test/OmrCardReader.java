package test;

public class OmrCardReader {
	private int correct[] =new int[5];
	
	public OmrCardReader(int a1, int a2, int a3, int a4, int a5) {
		this.correct[0] = a1;
		this.correct[1] = a2;
		this.correct[2] = a3;
		this.correct[3] = a4;
		this.correct[4] = a5;
	}
	
	public int claculateScore(OmrCard answers) {
		int score = 0;
		for (int i = 0;  i < correct.length; i ++) {
			if(correct[i] == answers.getAnswers()[i]) {
				score += 20;
			}
		}
		return score;
		
		
	}
	


}
