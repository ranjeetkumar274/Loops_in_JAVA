import java.util.Scanner;
public class BreakStatement {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = read.nextInt();
        for(int i = 2; i <= n-1; i++){
            if(n%i == 0){
                System.out.println("The number is composite.");
                break;
            }
            }
        System.out.println("The number is not composite.");
        }

    }
