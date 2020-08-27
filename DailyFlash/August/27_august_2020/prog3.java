import java.io.*;
class CubeSquares{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("\n Enter the no: ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.printf("\n Enter the no: ");
        int num2 = Integer.parseInt(br.readLine());

        System.out.printf("\nThe Addition %d & %d  is: %d",num1*num1*num1,num2*num2*num2,num1*num1*num1+num2*num2*num2);
        System.out.printf("\nThe Subtraction %d & %d  is: %d",num1*num1,num2*num2,num1*num1-num2*num2);
    }
}