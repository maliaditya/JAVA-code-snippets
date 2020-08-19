/*
Pattern52
G G G G G G G
  E E E E E
    C C C 
      A
*/

class Patter52{

    public static void main(String[] args) {

        int fspace=1, bspace=7;
        
        for(int i=0,p=7;i<5;i++){

            for(int j=0;j<9;j++){

                if(j<fspace ||j>bspace){

                    System.out.print("  ");

                } else{

                System.out.print((char)(64+p)+" ");

                }
            }
            p--;
            p--;
            fspace++;
            bspace--;
            System.out.println();
        }
    }
}