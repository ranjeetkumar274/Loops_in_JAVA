import java.util.Scanner;

public class GeometricProgression {
        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            System.out.print(" Enter the value of n : ");
            int n = read.nextInt();
            System.out.print("Enter the common ratio : ");
            int r = read.nextInt();
            int a = 1;
            for(int i = 1; i <= n; i++){
                System.out.println(a);
                a= a*r;
            }

        }

}
