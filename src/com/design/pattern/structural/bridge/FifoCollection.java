package com.design.pattern.structural.bridge;

public interface FifoCollection<T> {

	void offer(T data);

	T poll();

}
