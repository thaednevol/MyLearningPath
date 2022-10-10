package co.knry.essentials.collectionsAndGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class AllCollections {

    public static void main(String ... args){
        int[] arr = new int[]{2, 3, 4, 5, 6, 7};

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);


        LinkedList linkedList = new LinkedList();
        linkedList.add("Hola");
        linkedList.add("Mundo");

        linkedList.contains("Hola");

        System.out.println(linkedList);

        Queue myQueue = new LinkedList();
        myQueue.add("Hola");
        myQueue.offer("Mundo");
        myQueue.offer("Hola");

        System.out.println(myQueue);

        Queue queue = new ArrayBlockingQueue(2);
        boolean value = false;
        value = queue.offer(1);
        System.out.println("Offer Returned Value: " + value);
        value = queue.offer(2);
        System.out.println("Offer Returned Value: " + value);
        value = queue.offer(3);
        System.out.println("Offer Returned Value: " + value);

        Queue blockingQueue = new ArrayBlockingQueue(2);
        value = blockingQueue.add(5);
        System.out.println("Offer Returned Value: " + value);
        value = blockingQueue.add(10);
        System.out.println("Offer Returned Value: " + value);
        //value = blockingQueue.add(15);
        System.out.println("Offer Returned Value: " + value);

        ArrayList names = new ArrayList();
        names.add("Ola");
        names.add(new Date());

        System.out.println(names);


    }

}
