/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;
import java.util.Comparator;
/**
 *
 * @author teel6
 */
public class TestPriorityQueue {
    public static void main(String[] args) throws PriorityQueue.PriorityQueueException {
        System.out.println("Unsorted: ");
        int newItem = 15;
        int[] input = new int[newItem];
        for(int i = 0; i < newItem; i++){
            int Random = (int)(Math.random()*100);
            input[i] = Random;
        }
        System.out.println(java.util.Arrays.toString(input));
        PriorityQueue<int[]> pQueue = new PriorityQueue<>();
        pQueue.pqInsert(input);
        pQueue.PriorityQueue();
    }
}
