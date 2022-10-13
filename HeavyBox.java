package Lesson_24_Generics;

public class HeavyBox {
    private int weight;

    public HeavyBox(){weight = 0;}

    public HeavyBox(int weight) {this.weight = weight;}

    public String toString(){return "Box weight" + weight + " ";}

    public int getWeight() {        return weight;    }

    public void setWeight(int weight) {        this.weight = weight;    }

    public boolean changeWeight(int change) {
        boolean res = true;
        if (weight + change <= 0) res = false;
        else weight += change;
        return res;
    }
}
