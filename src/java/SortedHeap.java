package java;

/**
 * Created by artem on 5/7/16.
 */
public interface SortedHeap {

    //Add new Integer value to heap
    void add(Integer newValue);

    //Remove value with given index from heap
    void remove(int index);

    //Return value with given index without removing it from heap
    Integer find(int index);

    //Return current size of heap
    int size();
}
