import java.util.Scanner;
public class IT24102730Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for four subjects : ");

        System.out.print("Enter subject mark 1 : ");
        int mark1 = input.nextInt();
        System.out.print("Enter subject mark 2 : ");
        int mark2 = input.nextInt();
        System.out.print("Enter subject mark 3 : ");
        int mark3 = input.nextInt();
        System.out.print("Enter subject mark 4 : ");
        int mark4 = input.nextInt();

        double avg = (mark1 + mark2 + mark3 + mark4) / 4;

        System.out.println("\nAverage is : " + avg);
        System.out.print(0 <= avg && avg<= 49 ? "Overall Grade is : Fail" :
                         50 <= avg && avg <= 74 ? "Overall Grade is : Credit" :
                         75 <= avg && avg <= 100 ? "Overall Grade is : Distinction" : "Invalid marks entered");
    }
}