/*
Pattern53
A B C D E F G
  A B C D E
    A B C 
      A 
*/

class Patter53{

    public static void main(String[] args) {

        int fspace=1, bspace=7;
        
        for(int i=0,p=1;i<5;i++){

            for(int j=0;j<9;j++){

                if(j<fspace ||j>bspace){

                    System.out.print("  ");

                } else{

                System.out.print((char)(64+p)+" ");
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