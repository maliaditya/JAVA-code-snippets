/*
Pattern73
 E D C B A
  D C B A
   C B A 
    B A
     A
*/

class Pattern73{


    public static void main(String[] args) {
        
        int j, p=5;

        for(int i=0;i<5;i++){
            for (j=0;j<5;j++){
                if(j<i)
                System.out.print(" ");
                else
                System.out.print((char)(64+p)+" ");

                p--;
            }

            p=5;
        System.out.println();
        }   
    }
}