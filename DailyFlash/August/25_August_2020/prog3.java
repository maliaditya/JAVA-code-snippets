import java.io.*;
class evenNumber{


    public static void main(String[] args) throws IOException {
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if(num%2==0){
        System.out.println(num+" is a Even Number" );
        } else{
            System.out.println(num+" is a odd number" );

        }
    }
}