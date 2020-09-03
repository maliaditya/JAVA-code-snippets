import java.io.*;
class CubesAndSquares{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i = 0;i<=num;i++){
            if(i%2!=0){
                System.out.printf("%d : cube is %d square is %d",i,i*i,i*i*i);
            }
            System.out.println();
        }
    }
}