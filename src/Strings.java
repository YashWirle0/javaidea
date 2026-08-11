public class Strings {
    public static void main(String[] agrs) {
        //Strings
        //Concatenate
        String name1 = "Yash";
        String name2 = "Wirle";
        String name3 = name1 + name2;
        System.out.println(name3);

        //charAt
        String name4 = "Sherr";
        System.out.println(name4.charAt(0));
        System.out.println(name4.charAt(1));
        System.out.println(name4.charAt(2));
        System.out.println(name4.charAt(3));
        System.out.println(name4.charAt(4));

        //length
        String name5 = "Ewww";
        System.out.println(name5.length());

        //replace
        String name6 = "Sai";
        String name7 = name6.replace('a','e');
        System.out.println(name7);

        //Substring
        String name8 = "Yash and sai";
        System.out.printf(name8.substring(0, 4));
    }
}
