package com.design.pattern.structural.bridge;

public class Queue<T> implements FifoCollection<T> {

	LinkedList<T> list;

	public Queue(LinkedList<T> list) {
		this.list = list;
	}

	@Override
	public void offer(T data) {
		this.list.addLast(data);
	}

	@Override
	public T poll() {
		return this.list.removeFirst();
	}

}
