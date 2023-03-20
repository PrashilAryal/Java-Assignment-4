import Question4.Bird;
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("OPTION LIST: ");
        System.out.println("1. Question 1\n2. Question 2\n3. Question 3\n4. Question 4\n5. Question 5\n6. Exit");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                Ques1 multi = new Ques1();
                multi.multiplication();
            }
            case 2 -> {
                Ques2 converter = new Ques2();
                converter.currencyConverter();
            }
            case 3 -> {
                Ques3 fib = new Ques3();
                fib.fibonacci();
            }
            case 4 -> {
                System.out.println("Hello world");
                Bird.fly();
                Bird.eat();
                Bird.walk();
            }
            case 5 -> {
                Ques5 arrayPer = new Ques5();
                arrayPer.permutation();
            }
            case 6 -> System.out.println("\nPlease choose a correct number");
            default -> {
                System.out.print("Please enter a valid option");
            }
        }
    }
}