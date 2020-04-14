/*This program is debugged and it will compute to
give a latter grade for a number grade.
*/
import java.util.Scanner;
public class ifelseDebugg {
    public static void main(String args []){
        int testscore;
        char grade;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number grade");
        testscore=input.nextInt();


        if (testscore >= 90) {
            grade = 'A';
        }
        else if (testscore >= 80) {
            grade = 'B';
        }
        else if (testscore >= 70) {
            grade = 'C';
        }
        else if (testscore >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }

}
