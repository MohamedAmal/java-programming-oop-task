package OOP;

public class main {
    public static void main(String[] args) {
        Students student1 = new Students(1, "Ahmad", 2.7) ;  //creation + filling
        //Students student2 = new Students("Mohamed" , 2 , 3.1);
        student1.registerCourse();
        Doctors doctor1 = new Doctors(1, "Dr.Ashraf" );
        doctor1.registerCourse();


    }
}
