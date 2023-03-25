package com.design.pattern.structural.bridge;

public interface LinkedList<T> {

	void addFirst(T data);

	void addLast(T data);

	T removeFirst();

	T removeLast();

}
