
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter he value of n : ");
        int n = read.nextInt();

        for (int i = 1; i <= n; i++)

            System.out.println("Hello World");
    }
}
