class India{

    static int noOfActiveSoldiers = 1443921;

    int soldiersOnChinaBorder = 30000;

    static void displayPopulation(){

        System.out.println("No. of active soldiers in India: " + noOfActiveSoldiers);
    }

    void displayIndiaChinaBorder(){

        System.out.println("No. of soldiers deployed in Galwan Valley: " + soldiersOnChinaBorder);
    }

    // Galwan Valley & pangong Lake 
}

class China{

    static int noOfActiveSoldiers = 2035000;

    int soldiersOnBorder = 30000;

    static void displayPopulation(){

        System.out.println("No. of active soldiers in China: " + noOfActiveSoldiers);
    }

    void displayIndiaChinaBorder(){
        China obj = new china();
        System.out.println("No. of soldiers deployed in Galwan Valley: " + obj.soldiersOnChinaBorder );
    }


}
class Rivals{

    public static void main(String[] args){

    India galwanValley = new India();
    galwanValley.soldiersOnBorder = 20000;

    galwanValley.displayIndiaChinaBorder();
 
    India.displayPopulation();




    }
}