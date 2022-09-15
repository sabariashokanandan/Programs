class Engine 
{
    public void startWithDieselEngine() 
    {
        System.out.println("Diesel engine has added and it's started");
    }

    public void startWithPetrolEngine() 
    {
        System.out.println("Petrol engine has added and it's started");
    }

    public void startWithAutomaticEngine() 
    {
        System.out.println("Automatic engine has added and it's started");
    }
}

class ToyotaDiesel 
{
    public Engine engine;

    public Engine getEngine() 
    {
        return engine;
    }

    public void setEngine(Engine engine) 
    {
        this.engine = engine;
    }

    public ToyotaDiesel() 
    {
        System.out.println("Toyota Diesel  car has constructed");
    }

    public void startEngine() 
    {
        engine.startWithDieselEngine();
    }
}

class BenzAutomatic 
{
    public Engine engine;

    public Engine getEngine() 
    {
        return engine;
    }

    public void setEngine(Engine engine) 
    {
        this.engine = engine;
    }

    public BenzAutomatic() 
    {
        System.out.println("Benz Automatic car has constructed");
    }

    public void startEngine() 
    {
        engine.startWithDieselEngine();
    }
}

public class HasARelationShip 
{
    public static void main(String[] args) 
    {
        Engine engine = new Engine();

        System.out.println("ToyotaDiesel specific implementation.");
        ToyotaDiesel toyotaDieselCar = new ToyotaDiesel();

        toyotaDieselCar.setEngine(engine);
        toyotaDieselCar.startEngine();

        System.out.println("\nBenzAutomatic specific implementation.");
        BenzAutomatic benzAutomatic = new BenzAutomatic();

        benzAutomatic.setEngine(engine);
        benzAutomatic.startEngine();
    }
}