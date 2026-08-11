import java.util.Arrays;
public class ArraysExample {
    public static void main(String[] args) {
        int age = 20;
        int os = 95;
        int dbms = 90;
        int ct = 90;

        int[] marks = new int[3];
        marks[0] = 95;
        marks[1] = 90;
        marks[2] = 90;
        System.out.println(marks[0]);

        //sort
        //before sorting
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        //2d array
        int[] unittest = {97, 98, 99};

        int [][] finalmarks = {{91, 99, 92},{89, 87, 88}};
        System.out.println(finalmarks[1][2]);
    }
}
