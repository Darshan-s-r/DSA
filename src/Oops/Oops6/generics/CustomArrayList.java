package Oops.Oops6.generics;

public class CustomArrayList {
    private int DEFAULT_SIZE = 10;
    private int[] data;

    private int size = 0;


    public void add(int num){
        if(isFull()){
            reSize();
        }
        data[size++] = num;
    }
    private boolean isFull() {
        if(size == data.length){
            return true;
        }
        else return false;
    }
    private void reSize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(int index){
        int removiedItem = index;
        for (int i = index; i < data.length-1; i++) {
            data[i] = data[i+1];
        }
        size--;
        return removiedItem;
    }

    public int removeLast(){
        int removiedItem = data[--size];
        return removiedItem;
    }

    public int get(int index){
        return data[index];
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }





    public CustomArrayList(){
        data = new int[DEFAULT_SIZE];
    }


    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
//        list.removeLast();

        for (int i = 0; i < 15; i++) {
            list.add(i);
        }

        System.out.println(list.get(12));
        list.print();
    }
}
