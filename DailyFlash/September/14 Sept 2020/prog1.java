class Pattern{

    public static void main(String[] args) {
        
        int n=4,fSpace = n,bSpace=n,p = 1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n*2)-1;j++){
                if( j>=fSpace && j<=bSpace){
                System.out.print(" "+p);
                if (j<n)
                p++;
                else
                p--;

                }
                else{
                System.out.print("  ");
                }

            }
            p=1;
            fSpace--;
            bSpace++;
            System.out.println("  ");

        }
    }
}