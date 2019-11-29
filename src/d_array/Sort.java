package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		
		/*
		 * << 정렬 >>
		 * - 선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서
		 * 			  작은수와 자리 바꾸기를 반복해 앞에서부터 작은수를 채워나가는 방식
		 * - 버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은수와 자리바꾸기를
		 * 		   	  반복해 뒤에서 부터 큰수를 채워나가는 방식
		 * - 삽입정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰수들을 뒤로 밀고
		 * 			  중간에 삽입하는 방식
		 * - 석차구하기 : 모든 정수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가
		 * 			     작으면 등수를 1씩 증가시키는 방식
		 * 
		 */
		
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = i + 1;
		}
		
		shuffle(numbers);
		System.out.println(Arrays.toString(numbers));

//		selectSort(numbers); // 선택 정렬
//		bubbleSort(numbers); // 버블 정렬
//		insertSort(numbers); // 삽입 정렬
		printRank(numbers); //석차구하기
		
				
//		System.out.println(Arrays.toString(numbers));    //정렬 프린트
		

		
	}

	private static void printRank(int[] numbers) {
		
		//석차구하기 메서드 출력까지 여기서 실행..
		//넘버 길이와 같은 등수의 배열을 하나 더 만들어야함.
		//그리고 1을 채워 넣어야함.
		
		int rank[] = new int[numbers.length];
		
		for(int a = 0;a < rank.length;a++){
			rank[a] = 1;
		}
		
		for(int i = 0;i < numbers.length;i++){
		
			for(int j = 0;j < numbers.length;j++){
			if(numbers[i] < numbers[j]){
				rank[i] ++;
				}

			}
		}
		
		for(int i = 0; i < numbers.length ; i++){
		System.out.println(numbers[i] + " : " + rank[i] + "등");
		}
		
	}
	
	

	private static void insertSort(int[] numbers) {
		//삽입 정렬 메서드
		
		
		
		for(int i = 1; i < numbers.length; i++){
			
			int temp = numbers[i];
			int j = 0;
			
			for(j = i - 1;j >= 0; j--){
				
				if(temp < numbers[j]){              //큰수를 만났을때
					numbers[j + 1] = numbers[j];    //한칸 뒤로
				}else{                              // 작은수를 만났을때
					break;
				}
			}
			numbers[j+1]=temp;                      //작은수를 만났을때 여기실행
			
			
		}
		
	}
	
	

	private static void bubbleSort(int[] numbers) {
		/* 
		 * 0,1 1,2 2,3 3,4 5,6 6,7 7,8 8,9
		 * 0,1 1,2 2,3 3,4 5,6 6,7 7,8 
		 */
		//버블정렬
		
		
		for(int i = 0; i < numbers.length;i++){
			
			if(numbers[i] > numbers[i+1]){
				
				int temp = numbers[i];
				
				numbers[i] = numbers[i+1];
				numbers[i+1] = temp;
				
			}
		}
		
		
		
		
		
		
		
		
		
		
	}



		
/*		
			for(int i = 0; i < numbers.length - 1; i++){
				
				boolean changed = false;               //없어도 상관없다....
				
				for(int j = 0; j <numbers.length - i - 1; j++){
					
					if(numbers[j] > numbers[j + 1]){
						
						int temp = numbers[j];
						numbers[j] = numbers[j + 1];
						numbers[j+1] = temp;
						changed = true;
						
					}
				}
				if(!changed){
					break;
				}
				}
			}
	*/
	
		

	private static void selectSort(int[] numbers) {
		
		//선택 정렬 만들기

		
		
		for(int i = 0; i < numbers.length - 1; i++){
 
			for(int j = i + 1; j < numbers.length; j++){      //안에 for문이 돌아간다. 이프문에 의거하여...
				if(numbers[i] > numbers[j]){                  //다 돌아가면 바깥 for문으로 돌아가서 증감해서 다시 안 for으로 돌아옴.
					
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
				
			}

		}
		
	}
	

	private static void shuffle(int[] numbers) {
		for(int i = 0; i < numbers.length * 10; i++){
			int random = (int)(Math.random() * numbers.length);
			
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}
	}

}
