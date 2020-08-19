/*
Pattern71
 5 4 3 2 1
  4 3 2 1
   3 2 1
    2 1
     1
*/

class Pattern71{


    public static void main(String[] args) {
        
        int j, p=5;

        for(int i=0;i<5;i++){
            for (j=0;j<5;j++){
                if(j<i)
                System.out.print(" ");
                else
                System.out.print(p+" ");

                p--;
            }

            p=5;
        System.out.println();
        }   
    }
}