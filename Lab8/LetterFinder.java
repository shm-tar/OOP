import java.util.ArrayList;

import java.util.List;



import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
    
        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt();

        char letSearch = 'e';

        String textIns = "hello";

        String text = "My name is Tonia, er ses I am 14 years old";

        char[] charArr = text.toCharArray();

        for (int i=0; i < charArr.length; i++){
        	System.out.print(charArr[i]);
        }
        
        System.out.println();
        
        for(int i=1; i < charArr.length; i++) {
            if (charArr[i] == ' '){
            	if(charArr[i-1] == letSearch){
            		charArr[i-1] = 'a';
            	}
            }
        }
        
        for (int i=0; i < charArr.length; i++){
        	System.out.print(charArr[i]);
        }
  }
}
