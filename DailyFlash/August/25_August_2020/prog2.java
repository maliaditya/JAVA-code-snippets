import java.io.*;
class Number{


    public static void main(String[] args) throws IOException {
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum =0;
        for(int i=0;i<=num;i++){
            sum += i;
        }
        System.out.println(sum);
        
        
    }
}