class Student{
    private int id;
    private String name;

    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id=id;
    }
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;
    }
}
public class EncapsulationDemo{
    public static void main(String[] args) {
        Student s1= new Student();

        s1.setID(1);
        s1.setName("Shubham");

        System.out.println(" Student Id is: "+s1.getID());
        System.out.println(" Student name is : "+ s1.getName());

    }
}