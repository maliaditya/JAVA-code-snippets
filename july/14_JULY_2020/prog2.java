//Write a Real-Time Java Program that has three classes as Indian Army,
//Indian Navy & Indian Air Force, declare static & Instance Methods and Variables are
//call them from main method. Moreover, draw the JVM architecture to that program
//as well.


class IndianArmy{
    static String chiefOfArmyStaff = "General Manoj Mukund Naravane";

    void chief(){
        System.out.println("Chief of army Staff:  " + chiefOfArmyStaff);
    }

}

class IndianNavy{
    static String chiefOfNavalStaff = "Admiral Karambir Singh";

    void chief(){
        System.out.println("Chief of Naval Staff: " + chiefOfNavalStaff);
    }

}
class IndianAirForce{
    static String chiefOfAirStaff = "Marshal Rakesh Kumar Singh Bhadauria";

    void chief(){
        System.out.println("Chief of Air Staff:   " + chiefOfAirStaff);
    }

}

class IndianArmedForces{

    static String chiefOfDefence = "General Bipin Rawat";

    public static void main(String[] args){
        
        System.out.println("Commander in Chief:   " + chiefOfDefence);

        IndianArmy army = new IndianArmy();
        army.chief();

        IndianAirForce airforce = new IndianAirForce();
        airforce.chief();

        IndianNavy navy = new IndianNavy();
        navy.chief();
        


    }
}