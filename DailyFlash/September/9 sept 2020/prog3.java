import java.io.*;
class HrsToSecs{

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        int hrs = Integer.parseInt(br.readLine());

        int hr1 = 60*60;

        int secs = hr1*hrs;
        System.out.printf("\n %d seconds",secs);

   


    }
}