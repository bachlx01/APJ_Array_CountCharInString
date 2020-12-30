import java.util.Scanner;

public class CountNumberOfChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String myString = input.nextLine();
        System.out.print("Enter the char you want to count: ");
        char myChar = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == myChar) count ++;
        }
        System.out.println(count);
    }
}
