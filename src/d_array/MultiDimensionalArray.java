package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		/*
		 * << 다차원 배열 >>
		 * - 배열안에 배열이 저장되어 있는 형태이다.
		 */
		
		//대괄호의 위치는 상관없다.
		int[][] numbers = new int[2][3];   //배열 3개를 저장할수 있는 배열이 2개있다..
		int numbers2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};   //new int를 제외하는경우 선언과 초기화를 동시에 해야함
		int[] number3[] = { {1, 2, 3}
						  , {4, 5, 6}
						  , {7, 8, 9} };
		
		int[][] numbers4 = new int[3][]; //가변 배열
		numbers4[0] = new int[3];
		numbers4[1] = new int[4];
		numbers4[2] = new int[10]; // 크기를 다르게 지정할 수 있다.
		
//		numbers[0] = 10; //에러 1차원에 값을 저장할 수 없다.
		numbers[0] = new int[5]; //1차원에 배열을 저장할 수 있다.
		numbers[0][0] = 10; //2차원에 값을 저장할 수 있다.
		numbers[0][1] = 20;
		numbers[1][0] = 100;
		
		System.out.println(numbers.length); //1차원 배열의 길이
		System.out.println(numbers[0].length); //2차원 배열의 길이
		
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers[i].length;j++){
				System.out.println(numbers[i][j]);
			}
		}
		
		for(int i = 0; i < numbers.length; i++){
			System.out.println(Arrays.toString(numbers[i]));
		}
		
		int[][] scores = new int[3][5];
		/*
		 * {{1, 2, 3, 4, 5},
		 *  {1, 2, 3, 4, 5},
		 *  {1, 2, 3, 4, 5}}
		 *  scores[1][3] = 두번쨰 줄의 4임
		 *  sum : {300, 400, 500}
		 *  avg : {50, 70, 100}
		 */
		
		int[] sum = new int[scores.length]; //합계
		double[] avg = new double[scores.length]; //평균
		
		
		// 1~100 사이의 랜덤수를 발생시켜 scores에 저장해주세요.
		for(int i = 0; i < scores.length;i++){
			for(int j = 0; j < scores[i].length;j++){
				scores[i][j] = (int)(Math.random()*100)+1;
			}
			System.out.println(Arrays.toString(scores[i]));
		}

		
		//총점과 평균을 구해주세요.
		
		for(int i =0;i<sum.length;i++){
			for(int j = 0; j < scores[i].length;j++){
				sum[i] += scores[i][j];

			}	avg[i] = (double)sum[i]/scores[i].length;
				System.out.println("총점 : " + sum[i] + " /평균 : " + avg[i]);
		}
		
		
		



		
	}

}
