package com.Controll;

import com.Tests.*;
import com.Timer.BasicTimer;
import com.Timer.Timer;

public class Main {

    public static void main(String[] args) {
        Timer timer = new BasicTimer();

        //Test testGraph = new GraphCreatingTest(10_000,100,250);

        //Test testArrayWrite = new ArrayWriteSpeedTest(50_000_000);

        //Test arrTest = new BasicArray(true, 50_000_000);

        //BasicArray arr = new BasicArray(true,50_000_000);
        //Test testArrayRead = new ArrayReadSpeedTest(arr.getArray());

        Test BasicTreeMap = new BasicTreeMap(10_000_000);

        Test bitSetTest = new BasicBitSet(1000);

        System.out.println("Everything Created!");
        timer.startTimer();
        bitSetTest.startTest(2);
        timer.endTimer(2);
        System.out.println("Read BitSet\n");



        timer.startTimer();
        BasicTreeMap.startTest(2);
        timer.endTimer(2);
        System.out.println("Read TreeMap\n");

        /*
        timer.startTimer();
        testGraph.startTest(20);
        timer.endTimer(20);
        System.out.println("Create Graph\n");

        timer.startTimer();
        testArrayWrite.startTest(70);
        timer.endTimer(70);
        System.out.println("Array Write\n");

        timer.startTimer();
        testArrayRead.startTest(70);
        timer.endTimer(70);
        System.out.println("Array Read\n");

        timer.startTimer();
        arrTest.startTest(70);
        timer.endTimer(70);
        System.out.println("Array Create\n");
*/

    }
}
