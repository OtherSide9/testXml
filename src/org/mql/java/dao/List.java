package org.mql.java.dao;



public interface List<T> {
	public void add(T item,boolean b);
	public T get(int index);
	public int size();
	public T remove(int index);
	public boolean isEmpty();
}
