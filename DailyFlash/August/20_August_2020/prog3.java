import java.io.*;
class LeapYear{


    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Year: ");
        int year = Integer.parseInt(br.readLine());
        boolean ans;

        ans = year%4==0?( year%100==0?(year%400==0?true:false):(true)): false;

        if(ans==true)
        System.out.println(year + " is a leap year");
        else
        System.out.println(year + " is not a leap year");



    }
}