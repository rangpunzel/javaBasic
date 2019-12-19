package i_collection;

import java.util.ArrayList;

public class CollectionsFramework {

	public static void main(String[] args) {
		/*
		 * << CollectionsFramework >>
		 * - Collections	: 다수의 데이터
		 * - Framework		: 표준화된 프로그래밍 방식
		 * 
		 * << List >>
		 * - Vector		: ArrayList의 구버전
		 * - ArrayList	: 저장순서 유지, 중복 허용
		 * - LinkedList	: 데이터 추가 및 삭제시간 단축
		 * - Stack		: LIFO(Last In First Out)
		 * - Queue		: FIFO(First In First Out)
		 * 
		 * << Set >>
		 * - HashSet	: 중복 허용 안함, 저장순서 유지 안함
		 * - TreeSet	: 정렬, 검색 기능 향상
		 * 
		 * << Map >>
		 * - HashTable	: HashMap의 구버전
		 * - HashMap	: 키(key)와 값(value)을 한쌍으로 저장
		 * - TreeMap	: 정렬, 검색 기능 향상
		 */
		
		score();
	}

	private static void score() {
		/*
		 * 우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를
		 * 50 ~ 100까지 랜덤으로 생성시켜주시고,
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 
		 * 석차	이름		Java	Oracle	HTML	CSS	JQuery	JSP	총점 	평균
		 * 1	홍길동	90		100		80		50	30		90	400	70
		 * 2	홍길동	90		100		80		50	30		90	400	70
		 * 3	홍길동	90		100		80		50	30		90	400	70
		 * 4	홍길동	90		100		80		50	30		90	400	70
		 * 5	홍길동	90		100		80		50	30		90	400	70
		 * 과목별 평균		90		100		80		50	30		90
		 */
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("Java");
		subjects.add("Oracle");
		subjects.add("HTML");
		subjects.add("CSS");
		subjects.add("JQuery");
		subjects.add("JSP");
		
		ArrayList<String> students = new ArrayList<>();
		students.add("김지선");
		students.add("이누리");
		students.add("정대석");
		students.add("박종민");
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
		
		ArrayList<ArrayList<Double>> list = new ArrayList<>();
		
		//점수를 입력한다.
		for(int i = 0; i < students.size(); i++){
			ArrayList<Double> score = new ArrayList<>();
			
			score.add(1.0); //석차
			
			for(int j = 0; j < subjects.size(); j++){
				score.add((double)getRandom(50, 100));
			}
			
			list.add(score);
		}
		
		//총점과 평균을 구한다.
		for(int i = 0; i < list.size(); i++){
			ArrayList<Double> score = list.get(i);
			int sum = 0;
			for(int j = 1; j < score.size(); j++){
				sum += score.get(j);
			}
			score.add((double)sum); //총점
			score.add((double)sum / subjects.size()); //평균
		}
		
		
		//순위를 구한다.
		for(int i = 0; i < list.size(); i++){
			for(int j = 0; j < list.size(); j++){
				if(list.get(i).get(subjects.size() + 1)
						< list.get(j).get(subjects.size() + 1)){
					list.get(i).set(0, list.get(i).get(0) + 1);
				}
			}
		}
		
		//순위대로 정렬한다.
		for(int i = 0; i < list.size() - 1; i++){
			boolean changed = false;
			
			for(int j = 0; j < list.size() - 1 - i; j++){
				if(list.get(j).get(0) > list.get(j + 1).get(0)){
					ArrayList<Double> temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
					
					String tempName = students.get(j);
					students.set(j, students.get(j + 1));
					students.set(j + 1, tempName);
					
					changed = true;
				}
			}
			if(!changed) break;
		}
		
		//출력한다.
		System.out.print("석차\t이름");
		for(int i = 0; i < subjects.size(); i++){
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t총점\t평균");
		for(int i = 0; i < list.size(); i++){
			ArrayList<Double> score = list.get(i);
			for(int j = 0; j < score.size(); j++){
				System.out.print((int)((double)score.get(j)) + "\t");
				if(j == 0){
					System.out.print(students.get(i) + "\t");
				}
			}
			System.out.println();
		}
	}
	

	
	static int getRandom(int from, int to){
		return (int)(Math.random() * (Math.abs(to - from) + 1))
				+ Math.min(from, to);
	}

}










