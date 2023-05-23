package sec1;

import java.util.*;
class a_word_in_a_sentence {	
	public String solution(String str){
		String answer="";
		int m=Integer.MIN_VALUE;
		String[] s = str.split(" ");
		for(String x : s){
			int len=x.length();
			if(len>m){
				m=len;
				answer=x;
			}
		}
		return answer;
	}

	public static void main(String[] args){
		a_word_in_a_sentence T = new a_word_in_a_sentence();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.print(T.solution(str));
	}
}