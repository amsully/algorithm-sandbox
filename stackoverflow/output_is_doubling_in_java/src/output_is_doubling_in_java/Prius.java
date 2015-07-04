package output_is_doubling_in_java;

public class Prius extends Automobile
{
public Prius(String make, String model, String engine, String transmission,
    String horsepower, String torque, String compressionRatio,
    String fuelEconomy, String fuelRecommended)
{
 super(make, model, engine, transmission, horsepower, torque,
       compressionRatio, fuelEconomy, fuelRecommended);
}

public String getBattery()
{
 return this.battery;
}

public void setBattery(String battery)
{
 this.battery = battery;
}

@Override
public String toString()
{
 return super.toString() + "\nbattery  = " + battery;
}

private String battery;

}