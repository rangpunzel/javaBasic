package z_exam;

import java.util.Scanner;

public class Lovetype {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);  //사용자 입력창(answer) 설정
		
		String a_type = "A타입 입니다. 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!";
		String b_type = "B타입 입니다. 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!";
		String c_type = "C타입 입니다. 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!";
		String d_type = "D타입 입니다. 무조건 잘해주고, 무조건 맞춰주는 다퍼주는 연애를 하는 타입!";
			
		String q1 = "나는 금사빠다(Y/N)";
		String q2 = "연애할때 끌려다니는 타입니다(Y/N)";
		String q3 = "데이트 코스는 미리 짜는게 편하다(Y/N)";
		String q4 = "감정기복이 크지 않다(Y/N)";
		String q5 =	"감정 표현에 솔직한 편이다(Y/N)";
		String q6 = "활동적인 데이트가 좋다(Y/N)";
		String q7 = "연락이 없어도 믿고 기다리는 편이다(Y/N)";
		String q8 = "이성친구는 존재할 수 없다(Y/N)";
		String q9 = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다(Y/N)";
		
        System.out.println(q1);
		String answer1 = s.nextLine();
		if(answer1.equals("Y")){              //q1 Y
	        System.out.println(q2);
			String answer2 = s.nextLine();
			if(answer2.equals("Y")){         //q2 Y
		        System.out.println(q5);
				String answer3 = s.nextLine();
				if(answer3.equals("Y")){         //q5 Y
			        System.out.println(q8);
					String answer4 = s.nextLine();
					if(answer4.equals("Y")){         //q8 Y
				        System.out.println(q9);
						String answer5 = s.nextLine();
						if(answer5.equals("Y")){         //q9 Y D
					        System.out.println(d_type);	
						}else if(answer5.equals("N")){         //q9 N C
					        System.out.println(c_type);}
					}else if(answer4.equals("N")){         //q8 N B
				        System.out.println(b_type);}
				}else if(answer3.equals("N")){         //q5 N
			        System.out.println(q6);
					String answer4 = s.nextLine();
					if(answer4.equals("Y")){         //q6 Y
						System.out.println(q8);	
						String answer6 = s.nextLine();
						if(answer6.equals("Y")){         //q8 Y
							System.out.println(q9);	
							String answer7 = s.nextLine();
							if(answer7.equals("Y")){         //q9 Y D
								System.out.println(d_type);									
							}else if(answer7.equals("N")){         //q9 N C
						        System.out.println(c_type);}
						}else if(answer6.equals("N")){         //q8 N B
					        System.out.println(b_type);}
					}else if(answer4.equals("N")){         //q6 N
				        System.out.println(q9);}
						String answer6 = s.nextLine();
						if(answer6.equals("Y")){         //q9 Y D
							System.out.println(d_type);									
						}else if(answer6.equals("N")){         //q9 N C
					        System.out.println(c_type);}}
			}else if(answer2.equals("N")){         //q2 N
		        System.out.println(q3);
				String answer3 = s.nextLine();
				if(answer3.equals("Y")){         //q3 Y
					System.out.println(q6);	
					String answer11 = s.nextLine();
					if(answer11.equals("Y")){         //q6 Y
						System.out.println(q8);	
						String answer13 = s.nextLine();
						if(answer13.equals("Y")){         //q8 Y
							System.out.println(q9);	
							String answer14 = s.nextLine();
							if(answer14.equals("Y")){         //q9 Y D
								System.out.println(d_type);	
							}else if(answer14.equals("N")){         //q9 N C
						        System.out.println(c_type);}
						}else if(answer13.equals("N")){         //q8 N
					        System.out.println(b_type);}	
					}else if(answer11.equals("N")){         //q6 N
				        System.out.println(q9);}
						String answer15 = s.nextLine();
						if(answer15.equals("Y")){         //q9 Y D
							System.out.println(d_type);	
						}else if(answer15.equals("N")){         //q9 N C
					        System.out.println(c_type);}
				}else if(answer3.equals("N")){         //q3 N
			        System.out.println(q5);}
					String answer10 = s.nextLine();
					if(answer10.equals("Y")){         //q5 Y
						System.out.println(q8);	
						String answer21 = s.nextLine();
						if(answer21.equals("Y")){         //q8 Y
							System.out.println(q9);	
							String answer22 = s.nextLine();
							if(answer22.equals("Y")){         //q9 Y D
								System.out.println(d_type);	
							}else if(answer22.equals("N")){         //q9 N  C
						        System.out.println(c_type);}
						}else if(answer21.equals("N")){         //q8 N B
					        System.out.println(b_type);}
					}else if(answer10.equals("N")){         //q5 N
				        System.out.println(q6);}
						String answer22 = s.nextLine();
						if(answer22.equals("Y")){         //q6 Y 
							System.out.println(q8);
							String answer24 = s.nextLine();
						}else if(answer22.equals("N")){         //q6 N 
					        System.out.println(q9);
							String answer25 = s.nextLine();
							if(answer25.equals("Y")){         //q9 Y 
								System.out.println(d_type);
							}else if(answer25.equals("N")){         //q9 N C
						        System.out.println(c_type);						
					        }
			}
			}
		}else if(answer1.equals("N")){          //q1 N
	        System.out.println(q4);
			String answer40 = s.nextLine();
			if(answer40.equals("Y")){         //q4 Y 
				System.out.println(q7);
				String answer41 = s.nextLine();
				if(answer41.equals("Y")){         //q7 Y 
					System.out.println(a_type);
				}else if(answer41.equals("N")){         //q7 N
					System.out.println(q8);		
					String answer42 = s.nextLine();
					if(answer42.equals("Y")){         //q8 Y 
						System.out.println(q9);
						String answer51 = s.nextLine();
						if(answer51.equals("Y")){         //q9 Y  D
							System.out.println(d_type);
						}else if(answer51.equals("N")){         //q9 N C
							System.out.println(c_type);	
					}else if(answer42.equals("N")){         //q8 N
						System.out.println(b_type);	
					}
					}
				}
			}else if(answer40.equals("N")){         //q4 N
				System.out.println(q5);		
				String answer43 = s.nextLine();
				if(answer43.equals("Y")){         //q5 Y 
					System.out.println(q8);
					String answer44 = s.nextLine();
					if(answer44.equals("Y")){         //q8 Y 
						System.out.println(q9);
						String answer45 = s.nextLine();
					}else if(answer44.equals("N")){         //q8 N
						System.out.println(b_type);}	
				}else if(answer43.equals("N")){         //q5 N
					System.out.println(q6);		
					String answer46 = s.nextLine();
					if(answer46.equals("Y")){         //q6 Y 
						System.out.println(q8);
						String answer47 = s.nextLine();
						if(answer47.equals("Y")){         //q8 Y 
							System.out.println(q9);
							String answer48 = s.nextLine();
							if(answer48.equals("Y")){         //q9 Y D
								System.out.println(d_type);
							}else if(answer48.equals("N")){         //q9 N  C
								System.out.println(c_type);	
						}else if(answer47.equals("N")){         //q8 N B
							System.out.println(b_type);	
						}
						}
					}else if(answer46.equals("N")){         //q6 N
						System.out.println(q9);	
						String answer49 = s.nextLine();
						if(answer49.equals("Y")){         //q9 Y D
							System.out.println(d_type);
						}else if(answer49.equals("N")){         //q9 N  C
							System.out.println(c_type);}
					}				
}
						}			
						}			
	}
}