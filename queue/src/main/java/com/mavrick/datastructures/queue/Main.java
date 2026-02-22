package com.mavrick.datastructures.queue;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Queue queue = new Queue();

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.display();
        queue.pop();
        queue.display();

        System.out.println("Queue front: "+queue.front());
    }

}
