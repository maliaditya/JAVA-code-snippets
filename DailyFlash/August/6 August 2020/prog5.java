class Table{

    public static void main(String[] args) {
        System.out.println("Table of Three");
        
        for(int i=1;i<=10;i++){
            System.out.println("3 X "+i+ " = " + i*3);
        }
        System.out.print("Even Nos.: ");
        for(int i=1;i<=10;i++){
            if( i*3%2==0){
            System.out.print(i*3 + ", ");

            };
        }

    }
    
}