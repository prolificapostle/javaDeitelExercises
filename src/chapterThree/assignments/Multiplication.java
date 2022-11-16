package chapterThree.assignments;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        for (int count=1;count<=12;count++) {
            System.out.printf("%d times %d = %d\n ",number, count, (number*count));
        }
    }
}
