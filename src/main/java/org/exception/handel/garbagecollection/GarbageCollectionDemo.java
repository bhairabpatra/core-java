package org.exception.handel.garbagecollection;

public class GarbageCollectionDemo {

    public void GarbageDemo(){
        System.out.println("This garbage collection");
    }

    public static void  main(String[] args){
        System.out.println("This is garbage collection");
        GarbageCollectionDemo garbageCollectionDemo= new GarbageCollectionDemo();
        garbageCollectionDemo.GarbageDemo();
    }
}
