import java.util.*;

class Vehicle 
{
  final int speedlimit = 60;
  void controlSpeed() 
  {
    speedlimit = 150;
  }

  public static void main(String args[]) 
  {
    Vehicle obj = new Vehicle();
    obj.controlSpeed();
  }
}