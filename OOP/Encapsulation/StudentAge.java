class person{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>=0 && age <= 100){
          this.age=age;
         }else{
            System.out.println("Invalid ");
         }
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name != null && !name.trim().isEmpty()){
            this.name=name;
        }
        else
        {
            System.out.println(" invalid name provide ");
        }
    }
}
public class StudentAge{
    public static void  main(String[] args){
        person p = new person();
        person p1 = new person();

        p.setAge(22);
        p.setName("Shubham");

        System.out.println("Age : "+ p.getAge());
        System.out.println("Name: "+ p.getName());

        p1.setAge(122);
        p1.setName("Anant");
        System.out.println("Age : "+ p1.getAge());
        System.out.println("Name: "+ p1.getName());

    }
}