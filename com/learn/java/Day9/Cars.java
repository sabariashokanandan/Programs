public class Cars {
    String colour;
    String model;
    double mileage;
    public void startCar(){
            System.out.println("Car is starts !\n");
    }
 
    public void changeGears(){
        System.out.println("Gears changed !\n");
    }
 
    public void stopCar(){
        System.out.println("Car stopped !\n");
    }
    public String getInfo() {
            return ("Model:" +model + " Colour:" + colour + " Mileage:" +mileage);
        }
     
    public static void main (String args[]){
        Cars Suzuki = new Cars();
        Suzuki.model = "Baleno";
        Suzuki.colour = "Jet Black";
        Suzuki.mileage = 27.39;
        System.out.println(Suzuki.getInfo()+"\n");
        Suzuki.startCar();
        }
}