import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int mark = 90;
        if (mark >= 90)
            System.out.println("Grade S");
        else if(mark >= 80 && mark < 90) {
            System.out.println("Grade A");
        }
        else if (mark >= 70 && mark < 80) {
            System.out.println("Grade B");
        }
        else if (mark >= 60 && mark < 70) {
            System.out.println("Grade C");
        }
        else if (mark >= 50 && mark <60) {
            System.out.println("Grade D");
        }
        else if (mark >= 40 && mark <50) {
            System.out.println("Grade E");
        }
        else
            System.out.println("Grade F: Fail");
    }
}