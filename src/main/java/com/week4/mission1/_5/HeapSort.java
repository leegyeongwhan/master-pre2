package com.week4.mission1._5;

import java.util.ArrayList;

public class HeapSort {
     private ArrayList<Integer> heap = new ArrayList<>();

    public void insertHeap(int num) {
        heap.add(num);
        int P = heap.size() - 1;

        // 힙의 노드가2개이상
        while (P > 1 && heap.get(P / 2) > heap.get(P)) { // 부모의노드가 자식의 노드보다 클때
            int tmp = heap.get(P / 2);
            heap.set(P / 2, num);
            heap.set(P, tmp);

            P = P / 2;
        }
    }

    public void printHeap() {
    }

    public int getHeapSize() {
        return 0;
    }

    public int deleteHeap() {
        if (heap.size() - 1 < 1) {
            return 0;
        }
        //루트노드
        int del_Root_node = heap.get(1);
        //루트노드에 마지막값넣고 삭제
        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int pos = 1;// 왼쪽 자식의 인덱스값
        while ((pos * 2) < heap.size()) {
            int min = heap.get(pos * 2); //왼쪽 자식의 값
            int minPos = pos * 2;


            //오른쪽 자식의 인덱스가 사이즈보다 작고 왼쪽 보다 더 작을때 오른쪽 자식을 부모와 바꿔줄 자식으로 지정
            if (((pos * 2 + 1) < heap.size()) && min > heap.get(pos * 2 + 1)) {
                min = heap.get(pos * 2 + 1);
                minPos = pos * 2 + 1;
            }

            if (min > heap.get(pos)) {
                break;
            }

            int tmp = heap.get(pos);//부모
            heap.set(pos, heap.get(minPos));
            heap.set(minPos, tmp);
            pos = minPos;
        }
        return del_Root_node;
    }
}
