import java.util.Scanner;
public class Ques3 {
    public void fibonacci(){
        Scanner input = new Scanner(System.in);
        System.out.println("FIBONACCI SERIES");
        System.out.print("Enter a number upto which you want a fibonacci series: ");
        int number = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        int c = a + b;
        int i;
        for(i=2; i<=number; i++){
            System.out.print(c+" ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
