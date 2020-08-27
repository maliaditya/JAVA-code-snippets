import java.io.*;
class AddSub{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        System.out.printf("The Addition %d & %d  is: %d",num1,num2,num1+num2);
        System.out.printf("The Subtraction %d & %d  is: %d",num1,num2,num1-num2);
    }
}