import java.io.*;
class AreaOfRect{

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("\n Enter the Length of Rectangle: ");
        int length = Integer.parseInt(br.readLine());
        System.out.printf("\n Enter the Breadth of Rectangle: ");
        int breadth = Integer.parseInt(br.readLine());

        System.out.printf("\n Area of the rectangle \n Length = %d \n Breadth = %d \n Area = %d ", length,breadth,length*breadth);
    }
}