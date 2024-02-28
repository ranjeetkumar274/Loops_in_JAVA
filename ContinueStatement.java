import java.util.Scanner;
public class ContinueStatement {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = read.nextInt();
        // we are generating odd numbers by skipping even numbers.
        for(int i = 1; i < n ; i++){
            if(i%2 == 0){
                continue;
            }
            System.out.print(i+" ");
        }

    }
}
