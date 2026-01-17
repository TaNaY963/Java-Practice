class Human{
    private int age;
    private String name;
    public Human()//constructor
    {
        age=21;
        name="tanay";
    }
    public int getAge()//method for getting age as they can get data as they are in same class
    {
        return age;
    }
    // public void setAge(int age)
    // {
    //     this.age=age;
    // }
    public String getName()//method for getting name
    {
        return name;
    }
    // public void setName(String name)
    // {
    //     this.name=name;
    // }
}
public class Constructor
{
    public static void main(String[] args){
        Human obj = new Human();
        System.out.println(obj.getName()+" : "+obj.getAge());
        // obj.setAge(21);
        // obj.setName("Tanay");
        // System.out.println(obj.getAge()+" : "+ obj.getName());
    }
}