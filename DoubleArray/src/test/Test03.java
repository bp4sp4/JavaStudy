package test;

public class Test03 {

	public static void main(String[] args) {
//		 int[][] array = new int[2][3];

//	        for (int i = 0; i < array.length; i++) {
//	            for (int j = 0; j < array[i].length; j++) {
//	                array[i][j] = 10;
//	            }
//	        }
//	        
//	        for (int i = 0; i < array.length; i++) {
//	            for (int j = 0; j < array[i].length; j++) {
//	                System.out.print(array[i][j] + " ");
//	            }
//	            System.out.println();
//	        }
	        
	        
//	        int [][] array = new int[3][4];
	        
//	        for (int i = 0; i < array.length; i++) {
//	            for (int j = 0; j < array[i].length; j++) {
//	                array[i][j] = j+1;
//	            }
//	        }
//	        
//	        for (int i = 0; i < array.length; i++) {
//	            for (int j = 0; j < array[i].length; j++) {
//	                System.out.print(array[i][j] + " ");
//	            }
//	            System.out.println();
//	        }
	        
//	        int [][] array = new int [3][3];
//	        
//	        for (int i = 0; i < array.length; i++) {
//	        	for (int j = 0; j < array[i].length; j++) {
//	        		array[i][j] = i +1 ;
//	        	}	
//	        }
//	        
//	        for (int i = 0; i < array.length; i++) {
//	            for (int j = 0; j < array[i].length; j++) {
//	                System.out.print(array[i][j] + " ");
//	            }
//	            System.out.println();
//	        }
		
//		+자 그리기
//		[5][5] 크기의 배열을 만드세요.
//		모든 값을 0으로 초기화 하세요.
//		반복문을 이용해서, 아래와 같이 + 위치에 1을 입력 하고 출력하세요.
//		출력
//
//		0 0 1 0 0 
//		0 0 1 0 0 
//		1 1 1 1 1 
//		0 0 1 0 0 
//		0 0 1 0 0 
		
//		int [][] array = new int[5][5];
//		
//		for (int i = 0; i <array.length; i++) {
//			for(int j = 0; j < array[i].length; j++) {
//				array [i][j] = 0;
//			}
//		}
//		
//		for (int i = 0; i <array.length; i++) {
//			array [i][2] = 1;
//			array [2][i] = 1;
//		}
//		
//		for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
		
//		전체 수 입력
//		[3][3] 크기의 배열을 만드세요.
//		반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
//		출력
//
//		1 2 3 
//		4 5 6 
//		7 8 9 
		
//	    int[][] array = new int[3][3];
//        int num = 1;
//
//        // 숫자를 차례로 저장
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = num++;
//            }
//        }
//
//        // 배열 출력
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//        
//        전체 수 입력
//        [3][3] 크기의 배열을 만드세요.
//        반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
//        출력
//
//        1 4 7 
//        2 5 8 
//        3 6 9 

		 int[][] array = new int[3][3];
	     int num = 1;
	
         for (int j = 0; j < array[0].length; j++) {
         for (int i = 0; i < array.length; i++) {
                 array[i][j] = num++;
             }
         }

         for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array[i].length; j++) {
                 System.out.print(array[i][j] + " ");
             }
             System.out.println();
         }
	}
}
