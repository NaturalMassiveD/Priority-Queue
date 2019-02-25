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
 * @param <T>
 */
public class PriorityQueue<T> {
    private Heap<T> h;
    
    /**
     *
     */
    public void PriorityQueue() {
       h = new Heap<T>(); 
    }
    
    /**
     *
     * @param comparator
     */
    public  void PriorityQueue(Comparable <? super T> comparator){
        h = new Heap<>((Comparator<? super T>) comparator);
    }
    
    public boolean pqIsEmpty(){
        return h.heapIsEmpty();
    }
    
    public void pqInsert(T newItem) throws PriorityQueueException {
        try{
            h.heapInsert(newItem);
        }
        catch (HeapException e) {
            throw new PriorityQueueException(
            "PQueueException: Problem inserting to Priority Queue");
        }
    }
    
    public T pqDelete(){
        return h.heapDelete();
    }


    public static class PriorityQueueException extends Exception {

        public PriorityQueueException(String message) {
                super(message);
        }
    }
    public static class HeapException extends Exception {

        public HeapException(String message) {
            super(message);
        }
    }
}

