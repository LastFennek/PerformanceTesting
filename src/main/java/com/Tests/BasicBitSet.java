package main.java.com.Tests;

import java.util.BitSet;
import java.util.concurrent.ThreadLocalRandom;

public class BasicBitSet implements Test{

    int size;
    BitSet lowNum = new BitSet();
    private ThreadLocalRandom rand = ThreadLocalRandom.current();

    public BasicBitSet(){
        size = 100;
        fillBitSet();
    }

    public BasicBitSet(int size){
        this.size = size;
        fillBitSet();
    }

    private void fillBitSet(){
        int x = 0;
        for(int i = 0; i < size; i++){
            do{
                x = Math.abs(rand.nextInt());
            }while(lowNum.get(x));
            lowNum.set(x);

        }
    }


    private void readTest(){
        BitSet cloneNum = (BitSet)lowNum.clone();
        int x = 0;
        int y = 0;
        while (cloneNum.cardinality() >= 1){
            x += cloneNum.nextSetBit(y);
            y = cloneNum.nextSetBit(y+1);
            cloneNum.clear(cloneNum.nextSetBit(y));
        }
    }


    @Override
    public void startTest() {
        readTest();
    }

    @Override
    public void startTest(int times) {
        for(int i = 0; i < times; i++){
            readTest();
         }
    }
}
