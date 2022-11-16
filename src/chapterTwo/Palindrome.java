package chapterTwo;

import java.util.Scanner;
	public class Palindrome{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a 3 digit Number :");
			int threeDig = input.nextInt(); 
			int threeDig1 = threeDig % 1000 / 100;
			int threeDig2 = threeDig % 100 / 10;
			int threeDig3 = threeDig % 10;

			if (threeDig1 == threeDig3){
			System.out.print("It is a Palindrome");
			}
if (threeDig1 != threeDig3){
System.out.printf("It is not a Palindrome");
}
}
}