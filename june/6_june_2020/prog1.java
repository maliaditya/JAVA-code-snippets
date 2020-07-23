class Capgemini{
    
    static int noOfEmp = 200000;

    int projects = 200;

    static void displayEmp(){

        System.out.println("Count of Employees: " + Capgemini.noOfEmp);

    }

    void displayProjectsCount(){


        System.out.println("Count of projects: " + projects);
    }

}

class TCS{
    
    static int noOfEmp = 500000;

    int projects = 300;

    static void displayEmp(){

        System.out.println("Count of Employees: " + noOfEmp);

    }

    void displayProjectsCount(){


        System.out.println("Count of projects: " + projects);
    }

}

class Company{

    public static void main(String[] args){

        Capgemini pune = new Capgemini();
        pune.displayEmp();
        pune.projects = 130;
        pune.displayProjectsCount();

        Capgemini chennai = new Capgemini();
        chennai.displayEmp();
        chennai.projects = 70;
        chennai.displayProjectsCount();

        TCS pune1 = new TCS();
        pune1.displayEmp();
        pune1.projects = 200;
        pune1.displayProjectsCount();

        TCS banglore = new TCS();
        banglore.displayEmp();
        banglore.projects = 100;
        banglore.displayProjectsCount();

    }
}
