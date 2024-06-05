package test;

import java.util.Scanner;

public class OmrCard {
	 private String studentId;
	 private String studentName;
	 private int[] answers = new int[5];

	 public OmrCard(String studentId, String studentName) {
	     this.studentId = studentId;
	     this.studentName = studentName;
	 }
	    
	public void inputanswer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("객관식 문제 5개의 정답을 입력하세요 (1~5):");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "번 문제 정답: ");
            answers[i] = sc.nextInt();
        }
	}
        
        public String getStudentId() {
            return studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public int[] getAnswers() {
            return answers;
        }
	
}
