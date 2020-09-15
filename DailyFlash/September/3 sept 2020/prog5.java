import java.io.*;

class MinimumNo{

    public static void main(String[] args) throws IOException{

            

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.printf("\n Enter the 1st number: ");
            int num1 = Integer.parseInt(br.readLine());
            System.out.printf("\n Enter the 2nd number:" );
            int num2 = Integer.parseInt(br.readLine());
            System.out.printf("\n Enter the 3rd number: ");
            int num3 = Integer.parseInt(br.readLine());


            System.out.printf("\nThe Minimum Number between %d,%d & %d is: %d",num1,num2,num3,num1<num2?(num1<num3?num1:num3):(num2<num3?num2:num3));
    }
}