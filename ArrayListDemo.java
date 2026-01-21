 import java.util.Scanner;
 import java.util.ArrayList;
 public class ArrayListDemo
 {
    public static void main (String [] args)
    {
      Scanner sc = new Scanner(System.in);
      //syntax
      ArrayList<Integer> list1 = new ArrayList<>(); // single array list
      list1.add(67);// adding values to list
      list1.add(77);
      list1.add(57);
      list1.add(86);
      list1.add(65);
      System.out.println(list1);
      list1.set(0,10);//updating value at index 0 to 10 in list
      System.out.println(list1);
      list1.remove(2);//removes value which is at index 2
      System.out.println(list1);
      list1.remove(Integer.valueOf(10));//removing value which is 10 from list
      System.out.println(list1);
    }
 }