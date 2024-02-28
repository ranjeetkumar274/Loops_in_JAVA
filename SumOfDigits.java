import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int sum = 0;
        while(n != 0){
            int ld = n%10;
            sum = sum+ld;
            n = n/10;
        }
        System.out.print(sum);

    }
}