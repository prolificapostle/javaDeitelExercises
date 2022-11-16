package chapterThree.assignments;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number");
        int number = input.nextInt();
        int c=1;
        while (c<=12) {
            System.out.printf("%d times %d = %d%n", number, c, (number*c) );
            c++;
        }
    }
}
