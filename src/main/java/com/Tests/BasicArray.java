package main.java.com.Tests;

import java.util.concurrent.ThreadLocalRandom;

public class BasicArray implements Test{
    int[] arr;
    int size;
    Boolean withvalues;
    private ThreadLocalRandom rand = ThreadLocalRandom.current();

    public BasicArray(Boolean withValues, int size){
        this.withvalues = withValues;
        this.size = size;
        createArray();
    }

    public BasicArray(){
        createArray();
    }

    private void createArray(){
        arr = new int[this.size];
        for(int i = 0; i < arr.length; i++){
            if(this.withvalues){
                arr[i] = Math.abs(rand.nextInt());
            }else{
                arr[i] = 0;
            }
        }
    }

    public int[] getArray(){
        int[] test = new int[arr.length];
        System.arraycopy(arr, 0, test, 0, this.arr.length);
        return arr;
    }

    @Override
    public void startTest() {
        createArray();
    }

    @Override
    public void startTest(int times) {
        for(int i = 0; i < times; i++){
            this.createArray();
        }
    }
}
