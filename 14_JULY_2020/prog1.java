
class AtmaNirbharBharat{

    static float tradeDeficitInBillion = 48.66f;


    void tradeDeficit(){
        System.out.println("Trade deficite with China is $" + tradeDeficitInBillion + " billion" );
    }


    void boycottChina(){
        System.out.println("#BoycottChina Products");
        System.out.println("#Atmanirbhar Bharat");

    }

    public static void main(String[] args){

        AtmaNirbharBharat obj = new AtmaNirbharBharat();
        obj.tradeDeficit();
        obj.boycottChina();
    }


}