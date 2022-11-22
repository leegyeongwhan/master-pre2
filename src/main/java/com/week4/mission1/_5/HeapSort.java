package com.week4.mission1._5;

import java.util.ArrayList;

public class HeapSort implements Heap {
    private Heap heap = new MaxHeap();

    @Override
    public void insertHeap(int num) {
        heap.insertHeap(num);
    }

    @Override
    public void printHeap() {
        heap.printHeap();
    }

    @Override
    public int getHeapSize() {
        return heap.getHeapSize();
    }

    @Override
    public int deleteHeap() {
        return heap.deleteHeap();
    }
}
