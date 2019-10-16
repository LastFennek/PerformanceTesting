package main.java.com.Tests;

public class ArrayReadSpeedTest implements Test{

    int[] arr;

    public ArrayReadSpeedTest(int[] arr){
        this.arr = arr;
    }

    private void testArray(){
        int x = 0;
        for(int i = 0; i < arr.length; i++){
            x += arr[i];
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
