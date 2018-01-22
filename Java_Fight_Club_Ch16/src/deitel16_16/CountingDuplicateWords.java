package deitel16_16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CountingDuplicateWords {

    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        createMap(myMap); // create map based on user input
        displayMap(myMap);

    }

    public static boolean isLetter(char a) {
        return a == ' ' || a >= 'a' && a <= 'z';
    }

    private static void createMap(Map<String, Integer> map) {
        String str;
        StringBuilder s = new StringBuilder();

        System.out.println("Enter a string: ");
        str = new Scanner(System.in).nextLine().toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (isLetter(str.charAt(i))) {
                s.append(str.charAt(i));
            }
        }

        String[] tokens = s.toString().split(" ");

        // processing input text 
        for (String token : tokens) {
            String word = token.toLowerCase(); // get lowercase word

            // if the map contains the word
            if (map.containsKey(word)) // is word in map
            {
                int count = map.get(word); // get current count
                map.put(word, count + 1); // increment count
            } else {
                map.put(word, 1); // add new word with a count of 1 to map
            }
        }
    }

    // display map content
    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet(); // get keys

        // sort keys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        // generate output for each key in map
        for (String key : sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }

        System.out.printf(
                "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }

}
