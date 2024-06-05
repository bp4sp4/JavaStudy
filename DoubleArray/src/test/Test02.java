package test;

public class Test02 {

	public static void main(String[] args) {
		
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
		for(int i = 0; i < scores.length; i++) {
		    int sum = 0;
		    for(int j = 0; j < scores[i].length; j++) {
		        sum += scores[i][j];
		    }
		    System.out.println( i+1 + "번째 평균 점수는 " + (sum / (double)scores[i].length));
		}
		
		for (int i = 0; i < scores.length; i++) {
            int maxScore = scores[i][0];
            for (int j = 1; j < scores[i].length; j++) {
                if (scores[i][j] > maxScore) {
                    maxScore = scores[i][j];
                }
            }
            System.out.println(i + 1 + "번째 학생의 최고점 : " + maxScore);
        }
		
		
	       int beststd = 0;
	       double highavg = 0.0;

	        for (int i = 0; i < scores.length; i++) {
	            int sum = 0;
	            for (int j = 0; j < scores[i].length; j++) {
	                sum += scores[i][j];
	            }
	            double avg = (double) sum / scores[i].length;
	            if (avg > highavg) {
	            	highavg = avg;
	                beststd = i;
	            }
	        }

	        System.out.printf("평균이 가장 높은 학생 : %d번째 학생\n", beststd + 1);
	        System.out.printf("평균 : %.1f\n", highavg);
	        
//	        특정 과목 최고점
//	        index 4 과목의 최고 성적의 학생이 몇 번째 학생인지 출력하세요.
//	        출력
//
//	        index 4 과목의 최고 성적자는 3번째 학생
//	        점수 : 97
	        
	        int subindex = 4;
	        int highscore = 0;
	        int studindex = -1;
	        
	        for (int i = 0; i < scores.length; i++) {
	            if (scores[i][subindex] > highscore) {
	            	highscore = scores[i][subindex];
	            	studindex = i;
	            }
	        }
	        
	        System.out.printf("index %d 과목의 최고 성적자는 %d번째 학생%n", subindex , studindex + 1);
	        System.out.printf("점수 : %d%n", highscore);
	        
	        
//	        일부 평균 최고점
//	        시험과목 index 3 ~ 7 의 평균이 가장 높은 학생의 index를 구하여 출력하세요.
//	        출력
//	        평균이 가장 높은 학생 :  2번 index
//	        평균 : 93.8
	       
	        int startIndex = 3;
	        int endIndex = 7;
	        int bestStudentIndex = 0;
	        double highavg1 = 0.0;

	        for (int i = 0; i < scores.length; i++) {
	            int sum = 0;
	            int count = 0;
	            for (int j = startIndex; j <= endIndex; j++) {
	                sum += scores[i][j];
	                count++;
	            }
	            double average = (double) sum / count;
	            if (average > highavg1) {
	            	highavg1 = average;
	                bestStudentIndex = i;
	            }
	        }

	        System.out.printf("평균이 가장 높은 학생 : %d번 index%n", bestStudentIndex);
	        System.out.printf("평균 : %.1f%n", highavg1);
	       
	    }
	        

}
