/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deitel16_13;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Gosha
 */
public class DublicateElimitetion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set<String> names = new HashSet<>();
        String name;
        do {
            System.out.print("Enter your name or f to search it in list or -1 to exit: ");
            name = s.nextLine();
            if (name.equals("-1")) {
                break;
            }
            if (name.equalsIgnoreCase("f")) {
                System.out.print("Enter your name: ");
                name = s.nextLine();
                if (names.contains(name)) {
                    System.out.println(name + " already exists");
                } else {
                    System.out.println("It's smth new, let's add: " + name);
                }
            }
            names.add(name);
        } while (true);

        printCollection(names);

        s.close();
    }

    public static <S> void printCollection(Collection<S> s) {
        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
