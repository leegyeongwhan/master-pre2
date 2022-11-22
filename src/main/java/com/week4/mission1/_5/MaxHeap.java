package com.week4.mission1._5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaxHeap implements Heap {
    private List<Integer> heap;

    public MaxHeap() {
        this.heap = new ArrayList<>();
        heap.add(0);
    }

    @Override
    public void insertHeap(int num) {
        heap.add(num);
        int node = heap.size() - 1;

        while (node > 1 && heap.get(node / 2) < heap.get(node)) {
            int tmp = heap.get(node / 2);
            heap.set(node / 2, heap.get(node));
            heap.set(node, tmp);

            node = node / 2;
        }
    }

    @Override
    public void printHeap() {
        System.out.println("Max heap= " + heap.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }

    @Override
    public int getHeapSize() {
        return heap.size();
    }

    @Override
    public int deleteHeap() {
        if (heap.size() - 1 < 1) {
            return 0;
        }
        //루트노드
        int root_node = heap.get(1);
        //루트노드에 마지막값넣고 삭제
        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int pos = 1;
        while ((pos * 2) < heap.size()) {
            int max = heap.get(pos * 2); // 부모노드 자식의 값
            int maxPos = pos * 2;// 부모노드 자식의 인덱스값

            if (((pos * 2 + 1) < heap.size()) && max < heap.get(pos * 2 + 1)) {
                max = heap.get(pos * 2 + 1);
                maxPos = pos * 2 + 1;
            }

            if (max < heap.get(pos)) {
                break;
            }

            int tmp = heap.get(pos);//부모
            heap.set(pos, heap.get(maxPos));
            heap.set(maxPos, tmp);
            pos = maxPos;
        }
        return root_node;
    }
}
