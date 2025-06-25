import java.util.HashMap;
public class HashMap_program {

    public static void main(String[] args) {
        HashMap<String ,String> capitalCities = new HashMap<String,String>();
        // Adding keys and values
        capitalCities.put("England", "london");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("India", "Delhi");
        capitalCities.put("Colombia", "Bogota");
        capitalCities.put("USA", "NYC");


        System.out.println(capitalCities);

        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }
    }
}
