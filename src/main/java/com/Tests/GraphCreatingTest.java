package main.java.com.Tests;
import main.java.com.Graph.BasicGraph;
import main.java.com.Graph.Graph;

public class GraphCreatingTest implements Test{

    private Graph graph;
    private int size;
    private int density;
    private int upTo;
    private Boolean set = false;


    public GraphCreatingTest(int size, int density, int upTo){
        this.size = size;
        this.density = density;
        this. upTo = upTo;
        this.set = true;
    }

    public GraphCreatingTest(){}

    private void testGraph(){
        if(this.set){
            this.graph = new BasicGraph(this.size,this.density,this.upTo);
        }else{
            this.graph = new BasicGraph();
        }
    }


    @Override
    public void startTest() {
        this.testGraph();
    }

    @Override
    public void startTest(int times) {
        for(int i = 0; i < times; i++){
            this.testGraph();
        }
    }
}
