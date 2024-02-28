import java.util.Scanner;
public class PrintAllEven {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = read.nextInt();
        for(int i = 2; i <= n; i++){
            //if(i%2 != 0) is the condition to print all the odd numbers.
            if(i%2 == 0){
                System.out.print(i+ " ");
            }
        }

    }
}
