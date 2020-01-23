package com.codeWithMerald;

public interface Queue {
    int enqueue(Register data);
    Object dequeue();
    Object peek();
    int size();
    boolean isEmpty();
}
