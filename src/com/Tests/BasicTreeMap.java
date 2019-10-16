package com.Tests;

import java.util.Hashtable;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

public class BasicTreeMap implements Test{

    final private TreeMap<Integer,Integer> tm = new TreeMap();
    private ThreadLocalRandom rand = ThreadLocalRandom.current();
    int size;

    public BasicTreeMap(){
        this.size = 100;
        fillHashMap();
    }

    public BasicTreeMap(int size){
        this.size = size;
        fillHashMap();
    }


    private void fillHashMap(){
        for (int i = 0; i < size; i++){
            tm.put(Math.abs(rand.nextInt()),Math.abs(rand.nextInt()));
        }
    }

    private void readHashMap(){
        int x = 0;
        TreeMap<Integer,Integer> tmCopy = new TreeMap<>(){{putAll(tm);}};
        for (int i = 0; i < size; i++){
            x += tmCopy.get(tmCopy.firstKey());
            tmCopy.remove(tmCopy.firstKey());
        }
        tm.put(tm.firstKey(),tm.get(tm.firstKey())+1);
        //System.out.println(x);
    }



    @Override
    public void startTest() {
        readHashMap();
    }

    @Override
    public void startTest(int times) {
        for (int i = 0; i < times; i++){
            readHashMap();
        }
    }
}
