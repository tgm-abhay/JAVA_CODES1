package Java;

public class immutableStrings {
    public static void main(String[] args) {
        String s = "Abhay Kumar";

        // Demonstrating immutability: substring creates a new string, original 's' is unchanged
        System.out.println(s.substring(0, 4) + "r" + s.substring(5));

        // Comparing string literals vs. new String object
        String s1 = new String("Abhay Kumar");
        System.out.println(s == s1);       // false, because they are different objects
        System.out.println(s.equals(s1));  // true, because content is the same

        // StringBuilder is mutable
        StringBuilder sb1 = new StringBuilder("Abhay");
        sb1.append(" Kumar");
        System.out.println(sb1);           // prints "Abhay Kumar"
    }
}
