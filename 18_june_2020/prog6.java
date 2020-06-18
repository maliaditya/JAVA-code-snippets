class Covid19{

    Covid19(String cityName ,int  activeCases,int recovered,int deaths){
     
        System.out.println("\n City: " + cityName + "\n Active Cases: " + activeCases + "\n Recovered: " + recovered+ "\n Deaths: " + deaths);

    }

    public static void main(String[] args){

        
        Covid19 obj = new Covid19("Pimpri Chinchwad", 200, 70 , 20);
    }


}