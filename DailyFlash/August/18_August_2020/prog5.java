class maximum{

    public static void main(String[] args) {
        
        int a=1,b=4,c=2,max;

        max = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(max +" is Max number among "+ a +", "+b +" & "+ c);
        
    }
}