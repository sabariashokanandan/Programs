import java.util.*;

class EmployeeDetails 
{
  final int id;
  EmployeeDetails(int idNum) 
  {
    id = idNum;
  }

  void getDetails() 
  {
    System.out.println("Id of the Employee is: " + id);
  }

  public static void main(String args[]) 
  {
    EmployeeDetails emp = new EmployeeDetails(154);
    emp.getDetails();
  }
}