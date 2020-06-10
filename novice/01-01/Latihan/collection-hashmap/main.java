import java.util.HashMap;

public class main
{
    public static void main(String[] args) {
        // init hashmap
        HashMap<String, String> country = new HashMap<>();

        // populate hashmap
        country.put("germany", "berlin");
        country.put("franch", "paris");
        country.put("england", "london");

        // hashmap size
        System.out.println(country.size());

        // get value
        System.out.println(country.get("germany"));

        // check if value exists
        if(country.containsKey("franch")) 
        {
            System.out.println(country.get("franch"));
        }

        System.out.println("---------");

        // loop hashmap
        for(String value : country.values())
        {
            System.out.println(value);
        }

    }
} 