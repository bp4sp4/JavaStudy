package ex;

public class Ex02 {

	public static void main(String[] args) {
		// 이차원 배열 값 저장하기
		
		int [][] numbers =  new int[5][6];
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j< numbers[i].length; j++) {
//				numbers[i][j] = 5;
				// 열column) 별로 다른값 저장
//				numbers[i][j] = j + 1;
				// 행row) 별로 다른값 저장;
//				numbers[i][j] = i + 1; 
				
				
			}
		}
		
		for ( int i = 0; i< numbers.length; i++) {
			for (int j = 0; j< numbers[i].length; j++) {
				   System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

	}

}
