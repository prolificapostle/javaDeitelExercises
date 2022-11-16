package chapterThree.assignments;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number or 0 to end: ");
        int numberCollected = input.nextInt();
        int largest = numberCollected;
        int smallest = numberCollected;
        int secondLargest = numberCollected;

        do {

        if (numberCollected > largest) {
            largest = numberCollected;
        }
        if (numberCollected < smallest) {
            smallest = numberCollected;
        }
        if (numberCollected < largest &&  numberCollected > smallest){
            secondLargest = numberCollected;
        }
            System.out.println("Enter another Number or 0 to stop");
            numberCollected = input.nextInt();
        }
        while (numberCollected != 0);

        System.out.println("Largest Number is "+ largest);
        System.out.println("Smallest Number is " + smallest);
    }
}
