/*
Pattern48
4 4 4 4 4 4 4 
  3 3 3 3 3
    2 2 2 
      1
*/

class Patter48{

    public static void main(String[] args) {

        int fspace=1, bspace=7;
        
        for(int i=0,p=4;i<5;i++){

            for(int j=0;j<9;j++){

                if(j<fspace ||j>bspace){

                    System.out.print("  ");

                } else{

                System.out.print(p+" ");

                }
            }
            p--;
            fspace++;
            bspace--;
            System.out.println();
        }
    }
}