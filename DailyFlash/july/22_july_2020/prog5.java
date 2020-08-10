
class SARS{

    static void corona(SARS obj){
        System.out.print("Is COVID-19 from SARS family: ");
        System.out.println(obj instanceof SARS);

    }

    public static void main(String[] args) {
        SARS covid19 = new SARS();
        SARS.corona(covid19);


    }
    
}