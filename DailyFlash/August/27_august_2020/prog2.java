import java.io.*;
class divmul{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        System.out.printf("\nThe multiplication %d & %d  is: %d",num1,num2,num1*num2);
        System.out.printf("\nThe division %d & %d  is: %d",num1,num2,num1/num2);
    }
}