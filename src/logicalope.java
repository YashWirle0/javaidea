import java.util.Scanner;

public class logicalope {
    public static void main(String[] agrs) {
        //logical operators
        //&& - when both the conditions or statements are true then the output is true
        int a = 20;
        int b = 23;
        if( a < 50 && b < 50 )
            System.out.println("Both the numbers are less than 50");

        // || if any one of the condition is true then the statement gets executed in if block
        if(a < 50 || b < 50)
            System.out.println("atleast one of the number is less than 50");
        else
            System.out.println("none of them is greater than 50");


        Scanner sc = new Scanner(System.in);
        //pen = 10 and notebook = 40
        System.out.println("Enter your cash: ");
        int cash = sc.nextInt();

        if(cash < 10){
            System.out.println("Cannot buy anything");
            System.out.println("get more cash");
        }
        else if (cash > 10 && cash < 50) {
            System.out.println("can buy any one item");
        }
        else
            System.out.println("can buy both");
    }
}
