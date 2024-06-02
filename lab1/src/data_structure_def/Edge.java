package data_structure_def;

import java.util.Objects;

public class Edge{
    private String src;
    private String dst;
    private int weight;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void Weightinc() {
        this.weight ++;
    }


    public String output() {
        return "Edge{" + "from = " + src + ", to = " + dst + ", weight=" + weight + '}';
    }

    public boolean equals(Edge graphedge) {
        return  src.equals(graphedge.src) &&
                dst.equals(graphedge.dst);
    }
}