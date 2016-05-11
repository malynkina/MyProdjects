package java;

import java.SortedHeap;

/**
 * Created by artem on 5/7/16.
 */
public class SortedHeapImplementation implements SortedHeap {
    
    private Integer array[] = new Integer[10];
    //Когда мы создали массив таким образом он автоматически заполниося нулевыми элементами [null, null, null, null...]
    //Нам чтобы держать в памяти не номинальный размер массива а реальное количество элементов в структуре нужна еще одна переменная
    private int size = 0;
    //
    
    @Override
    public void add(Integer newValue) {
        if(size == array.length) {
            array = new Integer[array.length * 2];
        }
        array[size] = newValue;
        size++;
    }

    @Override
    public void remove(int index) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("index could not be less than 0 or more than size");
        }
        for( int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
    }

    @Override
    public Integer find(int index) {
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("index could not be less than 0 or more than size");
        }
        return array[index];
    }

    @Override
    public int size() {
        return size;
    }
}
