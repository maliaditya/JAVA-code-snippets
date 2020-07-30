import java.util.Scanner;

class Calculator{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("****Calulator****");
        
        System.out.print("Enter First number: ");
        int num1 = scan.nextInt();
        System.out.println();

        System.out.print("Enter the operator(+,-,*,/,%): ");
        char op  = scan.next().charAt(0);
        System.out.println();

        System.out.print("Enter Second number: ");
        int num2 = scan.nextInt();

        scan.close();
        
        switch(op){

            case '+' : 
                    System.out.print(num1 + " + " + num2 +" = " + (int)(num1+num2));
                    break;
            case '/' : 
                    System.out.print(num1 + " / " + num2 +" = " + (int)(num1/num2));
                    break;

            case '*' : 
                    System.out.print(num1 + " * " + num2 +" = " + (int)(num1*num2));
                    break;
            case '-' : 
                    System.out.print(num1 + " - " + num2 +" = " + (int)(num1-num2));
                    break;

            case '%' : 
                    System.out.print(num1 + " % " + num2 +" = " + (int)(num1%num2));
                    break;
                    



        }

    }
}