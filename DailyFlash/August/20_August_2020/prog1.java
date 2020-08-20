import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class PythagoreanTheorom{

    static void isValid(int a,int b,int c){
        if(a*a+b*b == c*c){
            System.out.println("Satisfies the Pythagorean Theorom!");
        }else{
            System.out.println(" Doesn't Satisfies the Pythagorean Theorom!");

        }

    }

    public static void main(String[] args)  throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Side1: ");
        int a = Integer.parseInt(br.readLine());
        System.out.println();
        
        System.out.print("Side2: ");
        int b = Integer.parseInt(br.readLine());
        System.out.println();

        System.out.print("Side3: ");
        int c = Integer.parseInt(br.readLine());

        isValid(a, b, c);
    }
}