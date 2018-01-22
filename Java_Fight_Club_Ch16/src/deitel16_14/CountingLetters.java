package deitel16_14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CountingLetters {

    public static void main(String[] args) {
        Map<Character, Integer> myMap = new HashMap<>();

        createMap(myMap); // create map based on user input
        displayMap(myMap); // display map content
    } // end main

    private static void createMap(Map<Character, Integer> map) {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a string:"); // prompt for user input
        String input = scanner.nextLine();

        char[] tokens = input.toLowerCase().toCharArray();

        for (char token : tokens) {
            if (token >= 'a' && token <= 'z') {
                if (map.containsKey(token)) // is word in map
                {
                    int count = map.get(token); // get current count
                    map.put(token, count + 1); // increment count
                } else {
                    map.put(token, 1); // add new word with a count of 1 to map
                }
            }
        }
    }

    // display map content
    private static void displayMap(Map<Character, Integer> map) {
        Set<Character> keys = map.keySet(); // get keys

        // sort keys
        TreeSet<Character> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        // generate output for each key in map
        for (Character key : sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }

        System.out.printf(
                "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
} // end class WordTypeCount

