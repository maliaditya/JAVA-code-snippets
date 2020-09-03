import java.io.*;
class MaxNo{

    public static void main(String[] args) throws IOException {
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("\n Enter 1st number:");
        int num1 = Integer.parseInt(br.readLine());

        System.out.printf("\n Enter 2nd number:");
        int num2 = Integer.parseInt(br.readLine());


        System.out.printf("\n The Maximum number between %d & %d is %d",num1,num2,num1>num2?num1:num2);

        }
    
}