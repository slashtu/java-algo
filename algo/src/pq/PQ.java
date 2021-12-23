package pq;

import java.util.PriorityQueue;

public class PQ {
  public static void main(String[] args) throws Exception {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        maxHeap.offer(3);
        maxHeap.offer(2);
        maxHeap.offer(1);
        maxHeap.offer(4);
        maxHeap.offer(5);

        while (!maxHeap.isEmpty()) {
          int max = maxHeap.poll();

          System.out.println(max);
        }
    }
}
