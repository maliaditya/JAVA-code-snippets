/*

Pattern56
3 
2 3 
1 2 3
0 1 2 3
1 2 3
2 3
3 

*/ 



class Pattern5{

    public static void main(String[] args) {
        
        for (int i=0,p=3;i<4;i++){

            for(int j=0;j<4;j++){

                System.out.print(p);
                p++;
            }
            p=p-i;
            System.out.println();

        }

    }
}