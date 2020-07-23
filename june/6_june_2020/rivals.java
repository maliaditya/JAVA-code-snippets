class India{

    static int noOfActiveSoldiers = 1443921;

    int soldiersOnChinaBorder = 30000;

    static int  noOfSoldiersDied = 20;

    static void displayPopulation(){

        System.out.println("No. of active soldiers in India: " + noOfActiveSoldiers);
    }

    void displayIndiaChinaBorder(){

        System.out.println("No. of soldiers deployed in Galwan Valley: " + soldiersOnChinaBorder);
    }

    void displayIndiaChinaBorderP(){

        System.out.println("No. of soldiers deployed in Pangong Lake: " + soldiersOnChinaBorder);
        System.out.println("No. of soldiers died on 15 june: " + noOfSoldiersDied);
    }

}

class China{

    static int noOfActiveSoldiers = 2035000;

    int soldiersOnChinaBorder = 30000;

    static int  noOfSoldiersDied = 35;

    static void displayPopulation(){

        System.out.println("No. of active soldiers in China: " + noOfActiveSoldiers);
    }

    void displayIndiaChinaBorder(){

        System.out.println("No. of soldiers deployed in Galwan Valley: " + soldiersOnChinaBorder );

    }

    void displayIndiaChinaBorderP(){

        System.out.println("No. of soldiers deployed in Pangong Lake: " + soldiersOnChinaBorder);
        System.out.println("No. of soldiers died on 15 june: " + noOfSoldiersDied);
    }


}
class Rivals{

    public static void main(String[] args){

    India galwanValley1 = new India();
    galwanValley1.soldiersOnChinaBorder = 20000;
    India.displayPopulation();
    galwanValley1.displayIndiaChinaBorder();

    India pangongLake1 = new India();
    pangongLake1.soldiersOnChinaBorder = 15000;
    pangongLake1.displayIndiaChinaBorderP();

    System.out.println(" ");

    China galwanValley2 = new China();
    galwanValley2.soldiersOnChinaBorder = 23000;
    China.displayPopulation();
    galwanValley2.displayIndiaChinaBorder();

    
    China pangongLake2 = new China();
    pangongLake2.soldiersOnChinaBorder = 13000;
    pangongLake2.displayIndiaChinaBorderP();

    }
}