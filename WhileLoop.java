import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        int i = 0; //initialization
        while(i<=n  ){    //condition
            System.out.print(i+" ");  // code here
            i++; // increment/decrement
        }
    }
}
