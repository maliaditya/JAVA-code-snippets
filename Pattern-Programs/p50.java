/*
Pattern50
1 2 3 4 5 6 7
  1 2 3 4 5
    1 2 3 
      1
*/

class Patter50{

    public static void main(String[] args) {

        int fspace=1, bspace=7;
        
        for(int i=0,p=1;i<5;i++){

            for(int j=0;j<9;j++){

                if(j<fspace ||j>bspace){

                    System.out.print("  ");

                } else{

                System.out.print(p+" ");
                p++;

                }
            }
            p=1;
         
            fspace++;
            bspace--;
            System.out.println();
        }
    }
}