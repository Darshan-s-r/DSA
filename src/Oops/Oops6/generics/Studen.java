package Oops.Oops6.generics;

public class Studen implements Comparable<Studen>,  Cloneable{

    int rollNo;
    float marks;

    public Studen(int rollNo, float marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }


    @Override
    public int compareTo(Studen o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

