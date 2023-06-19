package OOP;

public abstract class Parent {
    protected int id ;
    protected String name;

    public abstract void registerCourse() ;
    public Parent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Parent ()
    {

    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
