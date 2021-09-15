package Bt;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("num1: ");
        int num1 = input.nextInt();
        System.out.println("num2: ");
        int num2 = input.nextInt();
        if (num1 < num2){
            int temp = num1;
            num1 = num2;
            num2= temp;
        }
        System.out.print("Phep tinh " + num1 + " - " + num2 + "?");
        int answer=input.nextInt();
        if(num1 - num2 == answer){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect");
        }
    }   
}