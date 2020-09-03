import java.io.*;
class OddNos{

    public static void main(String[] args) throws IOException {
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("\n Min of series:");
        int min = Integer.parseInt(br.readLine());

        System.out.printf("\n Min of series:");
        int max = Integer.parseInt(br.readLine());


        System.out.printf("\n series of odd numbers ranging between %d and %d is: ",min,max);

        for(int i=min;i<=max;i++){
            if(i%2!=0){
                System.out.printf("%d ",i);
            }
        }
    }
}