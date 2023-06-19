package OOP;

public class Doctors extends Parent {

    @Override
    public void registerCourse()
    {
        System.out.println("I am an Instructor of the course");
    }

    public  Doctors (int id , String name)
    {
        super(id,name);
    }



}
