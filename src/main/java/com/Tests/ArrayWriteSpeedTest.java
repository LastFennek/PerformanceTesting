package main.java.com.Tests;

public class ArrayWriteSpeedTest implements Test{
    int size = 100;
    int[] arr;


    public ArrayWriteSpeedTest(){}
    public ArrayWriteSpeedTest(int size){
        this.size = size;
    }

    private void testArray(){
        this.arr = new int[size];
        for(int i = 0; i < this.arr.length; i++){
            arr[i] = 5;
        }
    }



    @Override
    public void startTest() {
        testArray();
    }

    @Override
    public void startTest(int times) {
        for(int i = 0; i < times; i++){
            testArray();
        }
    }
}
