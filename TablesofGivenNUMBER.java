import java.util.Scanner;
public class TablesofGivenNUMBER {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = read.nextInt();
        System.out.println("the table is : ");
        for(int i =1; i <= 10; i++){
            System.out.println(n*i);
        }
    }
}
