class Table{
    
    void table(int n,int i){
        for(int q=n;q<11;q++)
        System.out.printf(q + " X " + i +  " = " + q*i + "   ");
        System.out.println();
    }

    public static void main(String[] args) {
        int i;
        int n =2;
        Table obj = new Table();
        for(i=1;i<11;i++)
            obj.table(n,i);
    }
}