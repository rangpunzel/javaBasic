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
		
/*		int all[][] = new int[21][9];
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
			
			int tmp[][] = new int[1][10];
			String tmpstring = "";
			
			for(int i = 0; i < all.length; i++){
				 
				for(int j = i + 1; j < all.length; j++){      
					if(all[i][0] > all[j][0]){                  
						
						tmp[0] = all[i];
						all[i] = all[j];
						all[j] = tmp[0];
						
						tmpstring = name[i];
						name[i] = name[j];
						name[j] = tmpstring;
						
					}
					
				}

			}
			
			
			double avg[] = new double[6];
			   int sum[] = new int[6];
			
			//평균 구하기
			
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
					
		}*/
		
		String[] students = {"정대석", "박종민", "이누리", "김지선"};
		String[] subjects = {"Java", "Oracle", "HTML", "CSS", "JQuery", "JSP"};
		double[][] scores = new double[students.length][subjects.length+3];
		
		//점수를 입력한다.
		for(int i = 0; i < scores.length;i++){
			scores[i][0] = 1;
			for(int j = 0; j < subjects.length; j++){
				scores[i][j+1] = (int)(Math.random()*51)+50;
			}
		}
		
		//총점과 평균을 구한다.
		for(int i = 0; i <scores.length;i++){
			for(int j = 0; j < subjects.length;j++){
				scores[i][scores[i].length-2]
						+= scores[i][j+1];//총점
			}
			scores[i][scores[i].length-1]
					= (int)(scores[i][scores[i].length-2]/subjects.length*100 + 0.5)/100.0; //평균
		}
		
	//석차를 구한다.
		for(int i = 0; i < scores.length;i++){
			for(int j = 0; j < scores.length;j++){
				if(scores[i][scores[i].length-1] < scores[j][scores[j].length-1]){
					scores[i][0]++;
				}
			}
		}
			//정렬한다.
		for(int i =0; i < scores.length-1; i++){
			for(int j = i + 1; j < scores.length;j++){
				if(scores[i][0] > scores[j][0]){
					double[] temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
					
					String tempName = students[i];
					students[i] = students[j];
					students[j] = tempName;
				}
			}
		}
	
		
		//출력한다.
		System.out.print("석차\t이름");
		for(int i = 0; i < subjects.length;i++){
			System.out.print("\t" + subjects[i]);
		}
		System.out.println("\t총점\t평균");

		for(int i = 0; i <scores.length;i++){
			System.out.print((int)scores[i][0] + "\t" + students[i]);
			for(int j = 1; j < scores[i].length;j++){
				System.out.print("\t" + scores[i][j]);
			}
			System.out.println();
		}
		
		System.out.print("과목별 평균\t");
		for(int i =1;i <= subjects.length;i++){
			double sum = 0;
			for(int j = 0; j < scores.length;j++){
				sum += scores[j][i];
			}
			double avg = (int)(sum / scores.length * 100 +0.5)/100.0;
			System.out.print("\t" + avg);
		}
	}

}
