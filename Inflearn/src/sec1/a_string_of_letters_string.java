package sec1;

import java.util.*;
class a_string_of_letters_string {	
	public String solution(String str){
		String answer="YES";
		str=str.toUpperCase();
		int len=str.length();
		for(int i=0; i<len/2; i++){
			if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
		}
		return answer;
	}

	public static void main(String[] args){
		a_string_of_letters_string T = new a_string_of_letters_string();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
	}
}



//import java.util.*;
//class a_string_of_letters_string {	
//	public String solution(String str){
//		String answer="NO";
//		String tmp=new StringBuilder(str).reverse().toString();
//		if(str.equalsIgnoreCase(tmp)) answer="YES";
//		return answer;
//	}
//
//	public static void main(String[] args){
//		a_string_of_letters_string T = new a_string_of_letters_string();
//		Scanner kb = new Scanner(System.in);
//		String str=kb.next();
//		System.out.print(T.solution(str));
//	}
//}