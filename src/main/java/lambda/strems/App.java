package lambda.strems;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
import java.util.Arrays;

public class App{

     public static void main(String []args){
        // System.out.println("Hello World");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        int i;
        for(i = 0; i < n; i++)
            s[i]=in.nextInt();
        Double avg = findAverageUsingStream(s);
        System.out.println(avg);
        
     }
     public static double findAverageUsingStream(int[] array) {
        return Arrays.stream(array).average().orElse(Double.NaN);
    }
}
