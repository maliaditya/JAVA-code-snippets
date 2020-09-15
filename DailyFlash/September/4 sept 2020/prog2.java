import java.io.*;
class Number{


    public static void main(String[] args) throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("\n enter the number: ");
        int num = Integer.parseInt(br .readLine());

        System.out.printf("\n Second Predecessor: %d",num-2);
        System.out.printf("\n Second Sucessor: %d",num+2);



        

    }
}