package com.Graph;

import java.util.concurrent.ThreadLocalRandom;

public class BasicGraph implements Graph {
    private int[][] arr = new int[10][10];

    private ThreadLocalRandom rand = ThreadLocalRandom.current();
    //private Random rand = new Random(1);

    public BasicGraph(int size, int density, int upTo){
        this.arr = new int[size][size];
        this.createEdges(density, upTo);
    }

    public BasicGraph(){
        this.createEdges(100, 25);
    }

    private void createEdges(int density,int upTp){
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr.length; y++){
                if(density>rand.nextInt(100)){
                    arr[x][y] = rand.nextInt(upTp);
                }
            }
        }
    }

    public int[][] getArray() {
        int[][] test = new int[this.arr.length][this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            System.arraycopy(arr[i], 0, test[i], 0, this.arr[0].length);
        }
        return test;
    }

    public void printArray(){
        int count = 0;
        StringBuilder out = new StringBuilder();
        for (int[] x : arr){
            out.append("|").append(count).append("\t");
            count++;
        }
        out = new StringBuilder("|\t\t" + out + "\n\n");
        count = 0;
        for (int[] x : arr) {
            out.append("|").append(count).append("\t\t");
            count++;
            for (int y : x){
                out.append("|").append(y).append("\t");
            }
            out.append("\n");
        }
        System.out.println(out+"\n\n");
    }

    public void printArray(int[][] arr1){
        int count = 0;
        StringBuilder out = new StringBuilder();
        for (int[] x : arr1){
            out.append("|").append(count).append("\t");
            count++;
        }
        out = new StringBuilder("|\t\t" + out + "\n\n");
        count = 0;
        for (int[] x : arr1) {
            out.append("|").append(count).append("\t\t");
            count++;
            for (int y : x){
                out.append("|").append(y).append("\t");
            }
            out.append("\n");
        }
        System.out.println(out+"\n\n");
    }
}
