import java.io.*;


class ArithmeticOperation{

    public static void main(String[] args) throws IOException {
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("\n Enter the no: ");
        int a = Integer.parseInt(br.readLine());
        System.out.printf("\n Enter the no: ");
        int b = Integer.parseInt(br.readLine());
        System.out.printf("\n Enter the operator: ");
        int c = br.readLine().charAt(0);

        switch(c){
            case '+': System.out.printf("\n Addition of %d & %d is: "+a,b,a+b);break;
            case '-': System.out.printf("\n Subtraction of %d & %d is: "+a,b,a-b);break;
            case '*': System.out.printf("\n multiplicationdivision of %d & %d is: "+a,b,a/b);break;
            case '/': System.out.printf("\n Addition of %d & %d is: "+a,b,a*b);break;
        }

    }

}