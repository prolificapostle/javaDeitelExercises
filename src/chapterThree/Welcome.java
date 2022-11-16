package chapterThree;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
       Scanner inputDetails = new Scanner(System.in);
       System.out.print("Enter Your Name: ");
       String newName = inputDetails.nextLine();
       System.out.print("Enter Your Phone Number: ");
       String newPhoneNumber = inputDetails.next();
       Native natDetails = new Native();
       natDetails.setName(newName);
       natDetails.setPhoneNumber(newPhoneNumber);
       System.out.printf("Name: %s%nPhone Number: %s%n", natDetails.getName(), natDetails.getPhoneNumber());
    }
}
