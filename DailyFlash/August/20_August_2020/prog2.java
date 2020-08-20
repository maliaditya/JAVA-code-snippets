import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class SimpleInterest{

    static float isValid(float p,float r,float t){

        float SI = (p*r*t)/100;
       
        return SI;
    }

    public static void main(String[] args)  throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Principle: ");
        float p = Float.parseFloat(br.readLine());
        System.out.println();
        
        System.out.print("Interest: ");
        float r = Float.parseFloat(br.readLine());
        System.out.println();

        System.out.print("Time(years): ");
        float t = Float.parseFloat(br.readLine());

        Float SI = isValid(p,r,t);
        System.out.println("The Simple Interest is: " + SI);
    }
}