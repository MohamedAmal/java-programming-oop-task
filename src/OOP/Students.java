package OOP;

public class Students extends Parent
{
    //Attributes
    //Encapsulation >> setter - getter
    private double GPA ;

    //Methods
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Students(int id, String name, double GPA) {
            super(id,name);
            this.GPA = GPA;
    }

    //overloading >> the same name , diff signature (data type , #parameters)
    //overriding >> the same name , the same signature (inheritance)
    public void printInfo()
    {
        System.out.println(name + " " + GPA);
    }


    @Override
    public void registerCourse()
    {
        System.out.println("I am a student");
    }
}

/*
access modifier
public >> anywhere
private >> only class
protected >> in the same package - childs
none >> in the same package
 */