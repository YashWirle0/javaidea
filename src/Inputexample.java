import java.util.Scanner;

public class Inputexample {
    public static void main(String[] args) {
        //How to take input
        Scanner sc = new Scanner(System.in);
//        System.out.println("Input your age: ");
//        int age = sc.nextInt();
//        System.out.println("Your age is " + age);

        System.out.println("Enter your name: ");
        //sc.next will only return the first word
        //therefore sc.nextLine() is used for the whole line
        String name = sc.nextLine();
        System.out.println("Full name: " + name);
    }
}
