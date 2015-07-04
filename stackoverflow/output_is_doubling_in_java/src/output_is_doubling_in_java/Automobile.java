package output_is_doubling_in_java;

public class Automobile
{
Automobile(String make, String model, String engine, String transmission,
     String horsepower, String torque, String compressionRatio, String     fuelEconomy,
     String fuelRecommended)// setting make, model, engine and transmission
  {
  setMake(make);
  setModel(model);
  setEngine(engine);
  setTransmission(transmission);
  setHorsepower(horsepower);
  setTorque(torque);
  setCompressionRatio(compressionRatio);
  setFuelEconomy(fuelEconomy);
  setFuelRecommended(fuelRecommended);

 }// end of constructor Automobile

public String getMake()
{
  return this.make;
}

public void setMake(String make)
{
  this.make = make;
}

public String getModel()
{
  return this.model;
}

public void setModel(String model)
{
  this.model = model;
}

public String getHorsepower()
{
  return this.horsepower;
} 

public void setHorsepower(String horsepower)
{
  this.horsepower = horsepower;
}

public String getTorque()
{
  return this.torque;
}

public void setTorque(String torque)
{
  this.torque = torque;
}

public String getCompressionRatio()
{
  return this.compressionRatio;
}

public void setCompressionRatio(String compressionRatio)
{
  this.compressionRatio = compressionRatio;
}

public String getFuelEconomy()
{
  return this.fuelEconomy;
}

public void setFuelEconomy(String fuelEconomy)
{
  this.fuelEconomy = fuelEconomy;
}

public String getFuelRecommended()
{
  return this.fuelRecommended;
}

public void setFuelRecommended(String fuelRecommended)
{
  this.fuelRecommended = fuelRecommended;
}

public void setEngine(String engine)// setEngine by using switch loop to
                                   // invoke the classes that extend from
                                   // engine
{
  switch (engine) {
  default:
     System.out.println("Invalid engine entry: " + engine);
  }// end of switch loop for engine
 }// end of setEngine switch loop

public void setTransmission(String transmission)// setTransmission by using a
                                               // switch loop to invoke the
                                               // classes that extend from
                                               // transmission
{
  switch (transmission) {

  }// end of switch loop for transmission
 }// end of setTransmission switch loop

public String toString()
{
 return "\nmake = " + make + "; model = " + model + "\nengine = "
       + "\ntransmission = "  + "\nhorsepower = " + horsepower  + 
       "\nFuel Recommended = " + fuelRecommended + 
       "\nCompression Ratio = " + compressionRatio +"\ntorque = " + torque +
       "\nFuel Economy = " + fuelEconomy + "\nFuel Recommended = " +     fuelRecommended;
 }// end of String toString to print make, model, engine and transmission for
 // car

private String make;
private String model;
private String horsepower;
private String torque;
private String compressionRatio;
private String fuelEconomy;
private String fuelRecommended;

}// end of class Automobile