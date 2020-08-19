import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ValidTriangle{

    static void isValid(int a,int b, int c){

        if((a + b + c) ==180 ){
            System.out.printf("The triangle with angles %d, %d & %d is an valid one.",a,b,c);
        }else{
            System.out.printf("The triangle with angles %d, %d & %d is not a valid one.",a,b,c);

        }
    }

    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the Angles of Triangle.");
        System.out.print("1st: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("2nd: ");
        int b = Integer.parseInt(br.readLine());
        System.out.print("3rd: ");
        int c = Integer.parseInt(br.readLine());

        isValid(a, b, c);

    }
}