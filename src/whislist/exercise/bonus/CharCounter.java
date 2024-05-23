package whislist.exercise.bonus;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci una parola");

        String word = scanner.nextLine();
        scanner.close();

        HashMap <Character, Integer> map = new HashMap<>();

        for(int i = 0; i < word.length(); i++){
            char character = word.charAt(i);

            if(map.containsKey(character)){
                int counter = map.get(character) + 1;
                map.put(character, counter);
            }else{
                map.put(character, 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        /*

        Iterator<Map.Entry<Character, Integer>> iter = map.entrySet().iterator();

        while(iter.hasNext()){
            Map.Entry<Character, Integer> entry = iter.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }

*/


    }
}
