package java;

import java.SortedHeap;

/**
 * Created by artem on 5/7/16.
 */
public class SortedHeapImplementation implements SortedHeap {
    
    private Integer array[] = new Integer[10];
    
    @Override
    public void add(Integer newValue) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public Integer find(int index) {
        return array[index];
    }

    @Override
    public int size() {
        return array.length;
    }
}
