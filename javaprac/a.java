import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if (N%2 != 0)
            System.out.println("Weird");

        if (N%2 ==0){
            String res = null;

            res = (N < 5)? "Not Weird" : ( (N<=20)?"Weird" : "Not Weird" );
            System.out.println(res);
            
        }




        scanner.close();
    }
}
