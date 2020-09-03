import java.io.*;
class Swap2Nos{

    public static void main(String[] args) throws IOException {
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("\n Enter 1st number:");
        int num1 = Integer.parseInt(br.readLine());

        System.out.printf("\n Enter 2nd number:");
        int num2 = Integer.parseInt(br.readLine());
        System.out.printf("\n Before swap %d %d",num1,num2);

        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.printf("\n After swap %d %d",num1,num2);

        }
    
}