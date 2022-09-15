class Car 
{
    int avgSpeed;
    int currentSpeed;

    public int getCurrentSpeed() 
    {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) 
    {
        this.currentSpeed = currentSpeed;
    }

    public int getAvgSpeed() 
    {
        return avgSpeed;
    }

    public void setAvgSpeed(int maxSpeed) 
    {
        this.avgSpeed = maxSpeed;
    }

    public int getNoOfGears() 
    {
        return 6;
    }

    public String getDefaultColor() 
    {
        return "White";
    }
}

class Honda extends Car 
{
    public void startHondaCar() 
    {
        setAvgSpeed(70);
        System.out.println("Started Honda Car with average speed : " + getAvgSpeed());
    }

    public int getMaxSpeed() 
    {
        return 120;
    }

    public void stopHondaCar() 
    {
        System.out.println("Honda Car has stopped");
    }
}

class Maruthi extends Car 
{
    public void startHondaCar() 
    {
        setAvgSpeed(100);
        System.out.println("Started Maruthi Car with average speed : " + getAvgSpeed());
    }

    public int getMaxSpeed() 
    {
        return 100;
    }

    public void stopHondaCar() 
    {
        System.out.println("Maruthi Car has stopped");
    }
}

public class IsARelationShip 
{
    public static void main(String[] args) 
    {
        System.out.println("Honda specific implementation.");
        Honda hondaCar = new Honda();

        hondaCar.startHondaCar();
        System.out.println("Honda car max speed: " + hondaCar.getMaxSpeed());
        hondaCar.stopHondaCar();

        System.out.println("\nMaruthi specific implementation.");
        Maruthi maruthiCar = new Maruthi();

        maruthiCar.startHondaCar();
        System.out.println("Honda car max speed: " + maruthiCar.getMaxSpeed());
        maruthiCar.stopHondaCar();
    }
}