package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		/*
		 * 정규표현식 : 문자열의 패턴을 검사는 표현식 (회원가입할때 주로 사용)
		 * 
		 * ^	뒷 문자로 시작
		 * $	앞 문자로 종료
		 * .	임의의 문자(줄바꿈 제외)
		 * *	앞문자가 0개 이상
		 * +	앞 문자가 1개 이상
		 * ?	앞 문자가 없거나 1개
		 * []	문자의 집합이나 범위([a-z] : a부터 z까지, [^a-z] : a부터 z가 아닌것)
		 * {} 	앞 문자의 개수([2] : 2개, [2,4] : 2개이상 4개 이하)
		 * () 	그룹화(1개의 문자처럼 인식)
		 * |	OR 연산
		 * \s	공백, 탭, 줄바꿈
		 * \S	공백, 탭, 줄바꿈이 아닌 문자
		 * \w	알파벳이나 숫자
		 * \W 	알파벳이나 숫자가 아닌 문자
		 * \d	숫자
		 * \D	숫자가 아닌 문자
		 * (?i) 뒷 문자의 대소문자 구분 안함
		 *  \	정규표현식에서 사용되는 특수 문자 표현 (이스케이프문자)
		 */
		
		String str = "abc123";
		
		//패턴을 표현할때는 좁게 설정하는것이 좋다.
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";
		String regex = ".*";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		
		//아이디 5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다.
		//전화번호 숫자만..
		//이메일주소 소문자 @ . 포함
		
		String id = "ac_-__";
		
		regex = "[a-z0-9--_]{5,20}";
		
		p = Pattern.compile(regex);
		m = p.matcher(id);
		System.out.println("id "+m.matches());
		
		String num = "010-1234-5678";
		
		regex = "^0\\d{1,3}-\\d{3,4}-\\d{4}";
		
		p = Pattern.compile(regex);
		m = p.matcher(num);
		System.out.println("num "+m.matches());
		
		String mail = "ddddd123-_@ddd.co";
		
		regex = "[a-z0-9--_]{5,20}@[a-z]{1,10}.[a-z]{1,10}.[a-z]{1,10}";
		
		p = Pattern.compile(regex);
		m = p.matcher(mail);
		System.out.println("mail "+m.matches());
		
	}

}
