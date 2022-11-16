package chapterThree;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int numb = input.nextInt();
        if (numb % 2 == 1){
            System.out.print("Your Number is a Prime Number");
        }
        if (numb == 2){
            System.out.print("Your Number is a Prime Number");
        }
        else  {System.out.print("Your Number is not a Prime Number");}
    }
}
