import java.io.*;
class CheckDivisibility{

    static void isDivisibe(int num){

        if( num%5==0 && num%10 ==0 ){
            System.out.printf("%d is divisible by 5 & 10.",num);
        }
    }

    public static void main(String[] args) throws IOException {
        

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int num = Integer.parseInt(br.readLine());

        isDivisibe(num);

    }
}