class Pattern{


    public static void main(String[] args) {
        
        for(int i=0;i<5;i++){
            
            for(int j=0;j<5;j++){
                if (j<i+1){
                    if (i%2==0)
                    System.out.print("a ");
                    else
                    System.out.print("A ");

                }

            }
        System.out.println();
        }

    }
}