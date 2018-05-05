package ua.lpnuai.oop.shmilyk08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "Hello, my name is Joker. Your name is? Oh, no. Terrific.";
        System.out.println();
        System.out.print("Your text before: ");
        System.out.println(input);

        System.out.println();

        char[] entered = input.toCharArray();
        StringBuilder result = new StringBuilder();

        Scanner in = new Scanner(System.in);
        System.out.print("After what letter you wish to append: ");
        char letter = in.next().charAt(0);
        System.out.print("What you wish to append: ");
        in.nextLine();
        String insert = in.nextLine();

        System.out.println();

        if (input.length() > 0) {
            result.append(input.charAt(0));
            for (int i = 1; i < entered.length; i++) {
                    if (entered[i-1] == letter && (entered[i] == ' ' || entered[i] == ',' || entered[i] == '.')) {
                        result.append(" ");
                        result.append(insert);
                    }

                result.append(input.charAt(i));
            }
        }
        System.out.print("Your text after: ");
        System.out.println(result);
    }
}
