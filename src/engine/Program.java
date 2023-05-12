package engine;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map <String, String> cookies = new TreeMap<>();

        cookies.put("user","Pililiu");
        cookies.put("email","nervoso@gmail.com");
        cookies.put("address","rua pimpolha 01");

        System.out.println("-----All INFO FROM COOKIES DOWN BELOW-------");

        for(String key : cookies.keySet()){
            System.out.println(key + " : " + cookies.get(key));

        }

    }
}
