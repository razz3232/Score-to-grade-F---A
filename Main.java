import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Grades");
        int grades = input.nextInt();

        if(grades>=90){
            System.out.println("A Grade");
        }
        else if(grades>79 || grades>=89){
            System.out.println("B Grade");
        }
        else if(grades>69 || grades>=79){
            System.out.println("C Grade");
        }
        else if(grades>59 || grades>=69){
            System.out.println("D Grade");
        }
        else if(grades<=60){
            System.out.println("F Grade");
        }
        else System.out.println("Invalid Grades");
    }

}
