package test;

public class Test01 {

	public static void main(String[] args) {
		// 
		
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
        numbers[3] = 6;
        // 배열 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // 배열 출력(역순)
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
       
//        배열 출력(짝수)
        for (int i = 1; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        	
        // 2가 들어가있는
        System.out.print("2가 들어 있는 index: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 2) {
                System.out.println(i);
                break;
            }
        }
     //  배열의 최대값 출력
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("가장 큰 값: " + max);
        
        // 최솟값
        int min = numbers[0];
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }
        System.out.println("최소값의 index: " + minIndex);

       // 배열의 합
       int sum = 0;
       for (int i = 1; i < numbers.length; i++) {
    	   sum += numbers[i];
       }
       System.out.println("배열의 합 : " + sum);
	}

}
