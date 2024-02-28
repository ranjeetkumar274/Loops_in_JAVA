import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        int i = 0; //initialization
        do{
            System.out.print(i+" ");  // code here
            i++; // increment/decrement
        }while( i<=n  ); // condition
    }
}
// the only difference between while and do while is that while loop first check condition and then give output but in the case of do while loop it prints the value and then check the conditon.
// if there is every condition got failed still initialization will print in do while loop.