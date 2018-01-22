/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deitel16_18;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Gosha
 */
public class CopyingAndReversingLinkedLists {

    public static void main(String[] args) {
        List<Character> src = new LinkedList();
        LinkedList <Character> dst = new LinkedList();
        
        for(char a = 'a';a <= 'j'; a++){
            src.add(a);
        }
        
        Iterator a = src.iterator();
        while (a.hasNext()) {
            dst.addFirst((Character)a.next());
        }
        
        
        printList(src);
        printList(dst);
    }
    public static void printList(List s){
        Iterator a = s.iterator();
        while (a.hasNext()) {
            System.out.print(a.next());
        }
        System.out.println();
    }
}
