import java.io.*;
class EvenNos{

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        int limit = Integer.parseInt(br.readLine());
        System.out.printf("\n o/p: ");

        
        for(int i=limit;i>=0;i--){
        
            if (i%2==0)
            System.out.print(i+" ");
        }


    }
}class prog2 {
    
}
