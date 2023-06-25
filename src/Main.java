import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        char[] LoremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.".toCharArray();
        Map<Character, Integer> chcount = new HashMap<>();

        for(char c : LoremIpsum) {
            if (Character.isLetter(c)) {
                int value = 1;
                if (chcount.get(c) != null) {
                    value = chcount.get(c);
                    value++;
                }
                chcount.put(c, value);
            }
        }

        int min = Integer.MAX_VALUE;
        char charMin = ' ';
        int max = 0;
        char charMax = ' ';
        for(Map.Entry<Character, Integer> kv : chcount.entrySet()){
            int x = kv.getValue();
            if(x < min){
                min = x;
                charMin = kv.getKey();
            }
            if(x > max){
                max = x;
                charMax = kv.getKey();
            }
        }

        System.out.printf(charMin + " = " + min + ", " + charMax + " = " + max + ".");

    }
}