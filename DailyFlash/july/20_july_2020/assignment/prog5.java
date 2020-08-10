class Cricket{

    static int overs = 20;

    static int totalRuns1 = 0;

    int runs = 50;
    String player = "player1";

    static void totalOvers(){

        System.out.println("Remaing overs: " + --overs);
    }


    void runsForEachPlayer(){
        System.out.println("Total runs by: " + player+ " "  + runs++);
    }

    static void totalRuns(){
        System.out.println( "total runs: " + totalRuns1 );
    }

    public static void main(String[] args){

        System.out.println();
        Cricket player1 = new Cricket();
        player1.runsForEachPlayer();
        
        Cricket.totalOvers();

        
        System.out.println();

        Cricket player2 = new Cricket();
        player2.player = "Player2";
        player2.runs = 100;
        player2.runsForEachPlayer();

        Cricket.totalOvers();

        System.out.println();

        Cricket.totalRuns1 = player1.runs + player2.runs;
        Cricket.totalRuns();
        Cricket.totalOvers();

        

    }



    
}