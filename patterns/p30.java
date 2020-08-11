/*
Pattern30
5 5 5 5 5
  4 4 4 4
    3 3 3
      2 2
        1
*/

class Pattern30{

    public static void main(String[] args) {
        
        int j, p=5;

        for(int i=0;i<5;i++){
            for (j=0;j<5;j++){
                if(j<i)
                System.out.print("  ");
                else
                System.out.print(p+" ");

            }
            p--;
        System.out.println();
        }   
    }
}