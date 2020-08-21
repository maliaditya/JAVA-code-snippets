import java.io.*;

class ArithmeticOperations{

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        System.out.printf("\n***Arithmetic Operations****");
        System.out.printf("\n1. Addition");
        System.out.printf("\n2. Subtraction");
        System.out.printf("\n3. Division");
        System.out.printf("\n4. Multiplication");
        System.out.printf("\n-> Enter the no. of the above operation to be performed: ");
        int choice = Integer.parseInt(br.readLine());


        System.out.printf("\n Enter 1st number: ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.printf("\n Enter 2nd number: ");
        int num2 = Integer.parseInt(br.readLine());

        switch(choice){

            case 1: System.out.printf("\n Addition \n %d + %d = %d",num1,num2,num1+num2);
                    break;

            case 2: System.out.printf("\n Subtraction \n %d - %d = %d",num1,num2,num1-num2);
                    break;

            case 3: System.out.printf("\n Division \n %d / %d = %d",num1,num2,num1/num2);
                    break;

            case 4: System.out.printf("\n Multiplication \n %d * %d = %d",num1,num2,num1*num2);
                    break;

            default: System.out.printf("\n   WRONG CHOICE!");
        }
        

        
    }
}