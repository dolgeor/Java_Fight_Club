/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deitel16_21;

import java.util.Collections;
import java.util.PriorityQueue;



/**
 *
 * @author Gosha
 */
public class PriorityQueueSortOrder {

    public static void main(String[] args) {
        // queue of capacity 11
        PriorityQueue<Double> queue = new PriorityQueue<>(10, Collections.reverseOrder());

        // insert elements to queue
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);
        
        
        // display elements in queue
        while (queue.size() > 0) {
            System.out.printf("%.1f ", queue.peek()); // view top element
            queue.poll(); // remove top element
        }
    }
}
