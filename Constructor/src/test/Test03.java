package test;

public class Test03 {

	public static void main(String[] args) {
		   // 정답 배열을 설정
        int[] correctAnswers = {1, 2, 3, 4, 5};

        OmrCard oc = new OmrCard("1234567890", "김인규");
        oc.inputanswer();

        OmrCardReader omrCardReader = new OmrCardReader(5,4,2,4,3);
        omrCardReader.claculateScore(oc);
        
        System.out.println("이름 : " + oc.getStudentName());
        System.out.println("학번 : " + oc.getStudentId());
        System.out.println("점수 : " + omrCardReader.claculateScore(oc));
    }
}
