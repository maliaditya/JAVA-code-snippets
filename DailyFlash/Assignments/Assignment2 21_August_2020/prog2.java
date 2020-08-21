import java.io.*;


class AllDivisors{

    public static void main(String[] args) throws IOException{
        

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.printf("\n Enter the no to find its all divisors: ");
        int num = Integer.parseInt(br.readLine());
        System.out.println();
        
        for(int i=1;i<=num/2;i++){
            if(num%i == 0){
                System.out.print(i+" ");
            }
        }

    }
}