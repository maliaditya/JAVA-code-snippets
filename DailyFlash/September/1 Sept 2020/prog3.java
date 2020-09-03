import java.io.*;
class EvenNosCubesAndSquares{

    public static void main(String[] args) throws IOException {
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


        System.out.printf("\n Enter the range:");
        int max = Integer.parseInt(br.readLine());

        for(int i=1;i<=max;i++){
            if(i%2==0){
                System.out.printf("\n Cube of %d : %d and square of %d : %d ",i,i*i,i,i*i*i);
            }
        }
    }
}