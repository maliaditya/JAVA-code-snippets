import java.io.*;

class PerfectDivisors{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println("The Perfect Divisors of 24 are: ");
        for(int i=1;i<=num/2;i++){
            if (num%i == 0){
                System.out.print(i+" ");
            }
        }
    }
}