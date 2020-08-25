import java.io.*;
class SumAvg{


    public static void main(String[] args) throws IOException {
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum =0;
        for(int i=0;i<=num;i++){
            sum += i;
        }
        System.out.println("The sum of 10 entered number is: "+sum);
        System.out.println("The avg of 10 entered number is: "+sum/num);
        
        
    }   
}