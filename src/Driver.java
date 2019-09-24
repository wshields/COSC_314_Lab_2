import java.util.Scanner;
import java.util.Arrays;

public class Driver {

    public static void main(String args[]){
        int m , n;
        int [][] f;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter first integer:");
        m = keyboard.nextInt();

        System.out.println("Enter second integer:");
        n = keyboard.nextInt();

        f = new int[m+1][n+1];

        System.out.println("Enter the values for the boolean array. These are done row by row and should be ones and zeroes only.");
        for(int i = 0; i < m + 1; i++) {
            for(int j = 0; j < n + 1; j++) {
                int temp = keyboard.nextInt();
                if(temp == 1 || temp == 0) {
                    f[i][j] = temp;
                }else {
                    System.out.println("Bad Input. Try again");
                    j--;
                }
            }
        }

        for(int i = 0; i < m + 1; i++) {
            System.out.println(Arrays.toString(f[i]));
        }

    }

}
