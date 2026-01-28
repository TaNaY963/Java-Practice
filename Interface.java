@FunctionalInterface
interface A 
{
    void show(int i);
}
// class B implements A
// {
//     public void show()
//     {
//         System.out.println("in show");
//     }
// }

public class Interface{
    public static void main(String[] args){
        A obj = (  i) -> System.out.println("in show"+i); // lamda Expression in java
        // A obj = new A()
        // {        public void show () //anonymous in class
        //     {
        //         System.out.println("in show");
        //     }
        // };
        // A obj = new B(); // using another class to 
        obj.show(5);

    }
}