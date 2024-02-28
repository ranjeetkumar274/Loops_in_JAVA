import java.util.Scanner;
public class ArithmaticProgression {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print(" Enter the value of n : ");
        int n = read.nextInt();
        System.out.print("Enter the difference : ");
        int d = read.nextInt();
        for(int i = 1; i <= 1+(n-1)*d; i+=d){
            System.out.println(i);
        }

    }
}

