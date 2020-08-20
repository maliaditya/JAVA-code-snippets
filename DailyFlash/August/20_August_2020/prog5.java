import java.io.InputStreamReader;

import java.io.*;

class Percentage{



    public static void main(String[] args) throws IOException{
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Physics: ");
        int physics = Integer.parseInt(br.readLine());
        System.out.println();
        
        System.out.print("Chemistry: ");
        int chemistry = Integer.parseInt(br.readLine());
        System.out.println();

        System.out.print("Biology: ");
        int biology = Integer.parseInt(br.readLine());
        System.out.println();

        System.out.print("Maths: ");
        int maths = Integer.parseInt(br.readLine());
        System.out.println();

        System.out.print("Computer: ");
        int computer = Integer.parseInt(br.readLine());
        System.out.println();
        float scored = physics+chemistry+biology+maths+computer;
        float total_marks=500;
        float percentage = ((scored / total_marks) * 100);

        System.out.printf("Percentage = %g ",percentage);


        char grade;
        grade = percentage>=90?'A':percentage>=80?'B':percentage>=70?'C':percentage>=60?'D':percentage>=40?'E':percentage<40?'F':'E';

        System.out.println("Grade = " + grade);

    }
}