package Heaps;

import java.util.ArrayList;

public class MinHeap<T extends Comparable<T>> {
    public static void main(String[] args)throws Exception {
       MinHeap heap = new MinHeap<Integer>();
       heap.inser(34);
//        heap.inser(8);
        heap.inser(45);
        heap.inser(22);
        heap.inser(89);
        heap.inser(76);

        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.heapSort());
    }

    private ArrayList<T> list;
  public MinHeap(){
      list = new ArrayList<>(10);
  }

  private void swap(int first, int second){
      T temp = list.get(first);
      list.set(first, list.get(second));
      list.set(second, temp);
  }
private int parent(int index){
      return (index -1) / 2;
}

private int left(int index){
      return index * 2 + 1;
}

private int right(int index){
      return index * 2 + 2;
  }

  public void inser(T value){
      list.add(value);
      upHeap(list.size()-1);
  }

  private void upHeap(int index){
      if(index == 0){
          return;
      }
      int p = parent(index);
      if(list.get(index).compareTo(list.get(p)) < 0){
          swap(index, p);
      }
  }

  public T remove() throws Exception {
      if(list.isEmpty()){
          throw new Exception("Removing from the empty heap is not possible");
      }
      T temp = list.get(0);
      T last = list.remove(list.size() - 1);
      if(!list.isEmpty()){
          list.set(0, last);
          downHeap(0);
      }
      return temp;
  }

  private void downHeap(int index){
      int min = index;
      int left = left(index);
      int right = right(index);

      if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0 ){
          min = left;
      }

      if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
          min = right;
      }

      if(min != index){
          swap(min, index);
          downHeap(min);
      }
  }

  public ArrayList<T> heapSort() throws Exception {
      ArrayList<T> data = new ArrayList<>();

      while(!list.isEmpty()){
          data.add(this.remove());
      }
      return data;
  }

}
