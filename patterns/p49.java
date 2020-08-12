/*
Pattern49
7 7 7 7 7 7 7
  5 5 5 5 5
    3 3 3 
      1
*/

class Patter49{

    public static void main(String[] args) {

        int fspace=1, bspace=7;
        
        for(int i=0,p=7;i<5;i++){

            for(int j=0;j<9;j++){

                if(j<fspace ||j>bspace){

                    System.out.print("  ");

                } else{

                System.out.print(p+" ");

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