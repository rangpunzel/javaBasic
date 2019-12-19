package i_collection;

import java.util.ArrayList;

public class ArrayListScore {

	public static void main(String[] args) {
		/*
		 * add()	: 마지막 위치에 객체를 추가
		 * get()	: 지정된 위치의 객체를 반환
		 * set()	: 지정된 위치에 주어진 객체를 저장(수정)
		 * remove()	: 지정된 위치의 객체를 제거
		 * size()	: 저장된 객체의 수 반환
		 */
		//2차원 배열
		ArrayList<String> students = new ArrayList<>();
		
		students.add("김지선");
		students.add("이누리");
		students.add("박종민");
		students.add("정대석");
		students.add("정재영");
		students.add("강현철");
		students.add("주향한");
		students.add("윤창훈");
		students.add("연은주");
		students.add("김령환");
		students.add("구한나");
		students.add("백종빈");
		students.add("이병훈");
		students.add("강현지");
		students.add("김경운");
		students.add("이지형");
		students.add("이예림");
		students.add("이승재");
		students.add("민태홍");
		students.add("정보람");
		students.add("박진영");
		
		ArrayList<String> subjects = new ArrayList<>();
		
		subjects.add("Java");
		subjects.add("Oracle");
		subjects.add("HTML");
		subjects.add("CSS");
		subjects.add("JQuery");
		subjects.add("JSP");


		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		//점수를 입력한다.
		int sum = 0;
		for(int i = 0; i < students.size();i++){
			list.add(1);
			for(int j = 0; j < subjects.size(); j++){
				list.add((int)(Math.random()*51)+50);
				sum += list.get(j);
			}
			list.add(sum);
			list.add(sum/subjects.size());
			sum=0;

			scores.add(list);
			list = new ArrayList<>();
		}
		
		

		


		for(int i = 0; i < scores.size();i++){
			for(int j = 0; j < scores.size();j++){
				if(scores.get(i).get(7) < scores.get(j).get(7)){
						
					scores.get(i).set(0,scores.get(i).get(0)+1);
					
				}
			}
		}
		

		
		
		//정렬한다.
		ArrayList<Integer> temp;
		
		for(int i =0; i < scores.size()-1; i++){
			for(int j = i + 1; j < scores.size();j++){
				if(scores.get(i).get(0) > scores.get(j).get(0)){
					temp = scores.get(i);
					scores.set(i,scores.get(j));
					scores.set(j,temp);
					
					String tempName = students.get(i);
					students.set(i,students.get(j));
					students.set(j,tempName);
				}
			}
		}


		
		
		//출력한다.
		System.out.print("석차\t이름");
		for(int i = 0; i < subjects.size();i++){
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t총점\t평균");

		
		for(int i = 0; i <scores.size();i++){
			System.out.print(scores.get(i).get(0) + "\t" + students.get(i));
			for(int j = 1; j < scores.get(i).size();j++){
				System.out.print("\t" + scores.get(i).get(j));
			}
			System.out.println();
		}
		

		System.out.print("과목별 평균\t");
		
		
		
		for(int i =1;i <= subjects.size();i++){
			sum = 0;
			for(int j = 0; j < scores.size();j++){
				sum += scores.get(j).get(i);
			}
			double avg = (int)(sum / scores.size() * 100 +0.5)/100.0;
			System.out.print("\t" + avg);
		}
		
		
		
		
		
	}

}
