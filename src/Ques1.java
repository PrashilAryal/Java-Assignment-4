import java.util.Scanner;
public class Ques1 {
    public void multiplication(){
        Scanner input = new Scanner(System.in);

        System.out.println("MULTIPLICATION TABLE");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int i = 0;
        System.out.println("Multiplication Table of "+num+"is:");
        for(i=1; i<=10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
