package chapterThree.classWork;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int numEntered = input.nextInt();
        if (numEntered % 2 == 0){
            System.out.printf("%d is an Even Number", numEntered);
        }
        else {
            System.out.printf("%d is an Odd Number", numEntered);
        }
    }
}
