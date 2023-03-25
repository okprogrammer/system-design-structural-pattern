package com.design.pattern.structural.bridge;

public class SinglyLinkedList<T> implements LinkedList<T> {

	public class Node {
		private Object data;
		private Node next;

		private Node(Object data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private int size;
	private Node top;
	private Node last;

	@Override
	public void addFirst(T data) {
		if (top == null) {
			top = last = new Node(data, null);
		} else {
			top = new Node(data, top);
		}
		size++;
	}

	@Override
	public void addLast(T data) {
		if (last == null) {
			last = top = new Node(data, null);
		} else {
			last.next = new Node(data, last);
			last = last.next;
		}
		size++;
	}

	@Override
	public T removeFirst() {
		if (top == null) {
			return null;
		}
		@SuppressWarnings("unchecked")
		T temp = (T) top.data;
		if (top.next != null) {
			top = top.next;
		} else {
			top = last = null;
		}
		size--;
		return temp;
	}

	@Override
	public T removeLast() {
		if (last == null) {
			return null;
		}
		// if only one element is present
		if (top == last) {
			@SuppressWarnings("unchecked")
			T temp = (T) last.data;
			top = last = null;
			size--;
			return temp;
		}
		Node temp = top;
		while (top.next != last) {
			temp = temp.next;
		}
		@SuppressWarnings("unchecked")
		T tempData = (T) temp.data;
		last = temp;
		temp.next = null;
		size--;
		return tempData;
	}

	public int getSize() {
		return size;
	}

}
