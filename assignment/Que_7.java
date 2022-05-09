package assignment;

import java.util.Arrays;

public class Que_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'c';
        String st = Character.toString(ch);
        // Alternatively
        // st = String.valueOf(ch);

        System.out.println("The string is: " + st);
        System.out.println();
        
        System.out.println("Char array to String");
        char[] ch1 = {'a', 'e', 'i', 'o', 'u'};

        String st1 = String.valueOf(ch1);
        String st2 = new String(ch1);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println();
        
        System.out.println("String to char array");
        String st3 = "This is great";

        char[] chars = st3.toCharArray();
        System.out.println(Arrays.toString(chars));
	}

}
