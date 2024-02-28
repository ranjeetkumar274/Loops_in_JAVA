import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int count = 0;
        while(n != 0){
            n = n/10;
            count++;
        }
        System.out.print(count);

    }
}
