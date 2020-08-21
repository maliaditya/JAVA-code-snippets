import java.io.*;

class Squares{

    

    public static void main(String[] args) throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.printf("\n Enter Range1: ");
        int range1 =Integer.parseInt(br.readLine());



        System.out.printf("\n Enter Range2: ");
        int range2 =Integer.parseInt(br.readLine());
        

        System.out.printf("\n Square: ");
        
        for(int i=range1 ;i<=range2;i++){
            System.out.printf("%d ",i*i);

        }

        System.out.printf("\n Cube: ");
        
        for(int i=range1 ;i<=range2;i++){
            System.out.printf("%d ",i*i*i);

        }
    }
}