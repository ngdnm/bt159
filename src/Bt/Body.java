package Bt;
import java.util.Scanner;
public class Body {
    public static void main(String[] args) {
        System.out.println("Nhap BMI: ");
        Scanner input = new Scanner(System.in);
        Double x = input.nextDouble();
        if (x < 18.5){
            System.out.println("Underweight");
        }
        else if (x >= 18.5 && x < 25.0){
            System.out.println("Normal");
        }
        else if (x >= 25.0 && x < 30.0){
            System.out.println("Overweight");
        }
        else if (x >= 30.0) {
            System.out.println("Obese");
        }  
    }
}
