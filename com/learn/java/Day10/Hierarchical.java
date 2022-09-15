import java.util.*;
class Persons
{
    public void show()
    {
          System.out.println("I am a Person");
    }
}

class CollegeStudent extends Persons
{
    public void show1()
    {
          System.out.println("I am a College Student who is Person ");
    }
}

class Teacher extends Persons
{
    public void show2()
    {
          System.out.println("I am a Teacher who is a Person");
    }
}

class Doctor extends Persons
{
    public void show3()
    {
          System.out.println("I am a Doctor who is a Person");
    }
}

public class Hierarchical
{
    public static void main(String args[])
    {
          Teacher teacher = new Teacher();
          CollegeStudent collegestudent = new CollegeStudent();
          Doctor doctor = new Doctor();

          collegestudent.show();
          collegestudent.show1();
          teacher.show2();
          doctor.show3();
    }
}