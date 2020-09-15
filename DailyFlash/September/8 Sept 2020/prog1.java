import java.io.*;
class Increment{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("\n Enter the number: ");
        int inc = Integer.parseInt(br.readLine());
        for(int i=1;i<100;i+=inc){
            System.out.printf("%d ",i);

        }
        

        
    }
}