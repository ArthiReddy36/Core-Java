import java.util.*;
import java.Scanner;
public class PatternExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n= sc.nextInt(); 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); 
            }
            System.out.println();
        }
    }
}
