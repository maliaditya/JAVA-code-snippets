/*
Pattern51
D D D D D D D
  C C C C C
    B B B 
      A 
*/

class Patter51{

    public static void main(String[] args) {

        int fspace=1, bspace=7;
        
        for(int i=0,c=68;i<5;i++){

            for(int j=0;j<9;j++){

                if(j<fspace ||j>bspace){

                    System.out.print("  ");

                } else{

                System.out.print((char)(c)+" ");
                

                }
            }
            c--;
            fspace++;
            bspace--;
            System.out.println();
        }
    }
}