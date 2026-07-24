import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to count up to: ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Count: " + i);
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to count up to: ");
        int max = scanner.nextInt();

        int i = 1; 

        do {
            System.out.println("Count: " + i);
            i++; 
        } while (i <= max); 

        scanner.close();
    }
}
import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to count up to: ");
        int max = scanner.nextInt();

        int i = 1; 

        while (i <= max) { 
            System.out.println("Count: " + i);
            i++; 
        }

        scanner.close();
    }
}
