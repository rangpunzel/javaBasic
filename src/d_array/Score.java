package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		
		/*
		 * 우리반 모두(22명)의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를
		 * 50 ~ 100까지 랜덤으로 생성시켜주시고,
		 * 석차순으로 석차(평균의석차), 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 
		 * 순위      이름	  Java	Oracle HTML CSS JQuery JSP  총점    평균
		 * 1 	홍길동    90		100		80	50	30	   90   400  70
		 * 2 	홍길동    90		100		80	50	30	   90   400  70
		 * 3 	홍길동    90		100		80	50	30	   90   400  70
		 * 4 	홍길동    90		100		80	50	30	   90   400  70
		 * 5 	홍길동    90		100		80	50	30	   90   400  70
		 * 과목별 평균	  90	100		80	50	30	   90	400	 70
 		 */
		
		int all[][] = new int[21][9];
		String name[] = new String[21];
		
		name[0] = "김지선";
		name[1] = "이누리";
		name[2] = "박종민";
		name[3] = "정대석";
		name[4] = "정재영";
		name[5] = "강현철";
		name[6] = "주향한";
		name[7] = "윤창훈";
		name[8] = "연은주";
		name[9] = "김령환";
		name[10] = "구한나";
		name[11] = "백종빈";
		name[12] = "이병훈";
		name[13] = "강현지";
		name[14] = "김경운";
		name[15] = "이지형";
		name[16] = "이예림";
		name[17] = "이승재";
		name[18] = "민태홍";
		name[19] = "정보람";
		name[20] = "박진영";
		
		
		
		//50~100까지 점수 넣기.

			for(int j = 0; j < all.length;j++){
				for(int i = 1;i < all[j].length-2;i++){
					
				all[j][i] = (int)(Math.random()*50)+51;
				
			}
		}
			
			
			
		//총점을 인덱스 8에 평균을 인덱스 9에 넣기.

//			all[0][2]~[0][7]까지 더해야함
			
			for(int i = 0;i<all.length;i++){
				for(int j = 1;j<7;j++){
					all[i][7] += all[i][j];
				} all[i][8] += all[i][7]/6;
				
			}
		
			
			

			
//		석차구하기
			

			for(int a = 0;a < all.length;a++){
				all[a][0] = 1;
			}
			
			for(int i = 0;i < all.length;i++){
			
				for(int j = 0;j < all.length;j++){
				if(all[i][7] < all[j][7]){
					all[i][0] ++;
					}

				}
			}
			
			
//			정렬
			
			int temp[][] = new int[1][10];
			String tempstring = "";
			
			for(int i = 0; i < all.length; i++){
				 
				for(int j = i + 1; j < all.length; j++){      
					if(all[i][0] > all[j][0]){                  
						
						temp[0] = all[i];
						all[i] = all[j];
						all[j] = temp[0];
						
						tempstring = name[i];
						name[i] = name[j];
						name[j] = tempstring;
						
					}
					
				}

			}
			
			
			double avg[] = new double[6];
			   int sum[] = new int[6];
			
			//[][2] ~[][7]
			
			for(int i = 0; i < avg.length;i++){
			   for(int j = 0;j < all.length;j++){

				   
				   sum[i] += all[j][i+1];
				   avg[i] = ((int)(sum[i]/(double)all.length*100))/100.0;
				   
			   }
			}
			




				
			
			
			System.out.println("석차"+"\t이름"+"\tJava"+"\tOracle"+"\tHTML"+"\tCSS"+"\tJQuery"+"\tJSP"+"\t총점"+"\t평균");
		for(int i = 0; i < all.length;i++){
			System.out.print(all[i][0]+"\t");
			System.out.print(name[i]+"\t");
			for(int j = 1; j < all[i].length;j++){
				
				
				System.out.print(all[i][j]+"\t");
				
			}System.out.println();
		}
		System.out.print("과목별평균\t"+"\t");
		for(int i = 0; i < avg.length;i++){
		System.out.print(avg[i]+"\t");
					
		}
			

		
			
			
		
	}

}
