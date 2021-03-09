package lab3;

import java.util.Scanner;

public class ex3 {
	public static boolean vowel(char c) {
		if(c!='a' && c!='e' && c!='i'&& c!='o'&& c!='u') {
			
			return false;
		}
		return true;
	}
    public static String alterString(char[] s) {
    	
    	for(int i=0;i<s.length;i++) {
    		if(!vowel(s[i])) {
    			s[i]=(char)(s[i]+1);
    			
    			
    		}
    		
    	}
    	return String.valueOf(s);
    	
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the string");
		String input=sc.nextLine();
		System.out.println(" new string: "+ alterString(input.toCharArray()));

	}

}
