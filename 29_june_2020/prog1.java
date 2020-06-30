class CoronaMaha{

    int count = 70000;
    void precautions(){

        System.out.println("Kalji Ghya");
        System.out.println("count = " + count);

    }

    static void impDecision(){

        System.out.println("CM Decision");
    }

    public static void main(String[] args){

        CoronaMaha June28 = new CoronaMaha();
        June28.precautions();
        June28.impDecision();

        CoronaMaha June29 = new CoronaMaha();
        June29.count = 75000;
        June29.precautions();

    }
}