package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyHashSet {
    private ArrayList<Integer>[] buckets;

    private int numElements = 2;

    public MyHashSet(){
        buckets = new ArrayList[10];
        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }
    }
    public ArrayList<Integer>[] getBuckets() {
        return buckets;
    }


    public int getNumElements() {
        return numElements;
    }

    public void setNumElements(int numElements) {
        this.numElements = numElements;
    }

    public void add(int i){
        ArrayList<Integer> bucketList;
        if(hasItem(i)){
            return;
        }

        int bucketIndex = i % numElements;

        bucketList = buckets[bucketIndex];

        bucketList.add(i);

        numElements++;
    }

    public void show() {
        ArrayList<Integer> currentList;
        for (int i = 0; i < numElements; i++) {
            currentList = buckets[i];

            for(Integer data : currentList){
                System.out.println(" " + data);
            }
            System.out.println();
        }
    }
    public boolean hasItem(int targetItem){
        ArrayList<Integer> bucketList;
        int bucketIndex;

        bucketIndex = targetItem % buckets.length;

        bucketList = buckets[bucketIndex];

        for (Integer integer : bucketList) {
            if (targetItem == integer) {
                return true;
            }
        }
        return false;
    }
}
;