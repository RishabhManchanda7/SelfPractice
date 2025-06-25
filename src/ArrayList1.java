import java.util.ArrayList;
public class ArrayList1 {
    public static void main (String[] args ){
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("Mango");
        fruits.add("grapes");

        System.out.println(fruits.size());
        System.out.println(fruits);

        for (String i : fruits){
            System.out.println(i);
        }
    }
}
