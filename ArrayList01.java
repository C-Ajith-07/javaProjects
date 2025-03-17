package project;

import java.util.Arrays;
//import java.util.Iterator;
import java.util.Collection;

//import java.util.Arrays;

public class ArrayList01<T>{

	private int size=10;
	public ArrayList01() {
		size = 10;
	}
	
	
	public ArrayList01(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
	}
	
	int count =0;
	private T[] list = (T[]) new Object[size]; 
	public void add(T value) {
		if(size ==  count) {
			size += size/2;
			list=Arrays.copyOf(list, size);
		}
		list[count] = value;
		count++;
	}
	
	public T get(int idx) {
		
		if(idx>=count) {
			throw new IndexOutOfBoundsException();
		}
		return list[idx];
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public int size() {
		return count;
	}
	
//	public void containAll(T[] arr ) {
//		int check =0;
//		for(int i=0; i<arr.length; i++) {
//			if()
//		}
//	}
	
	public void add(int idx , T value) {
		if(idx >= count) {
			throw new IndexOutOfBoundsException();
		}
		list[idx] = value;
	}
	
	public void addFirst(T value) {
		T[] newArr ;
		if(count+2 <= size) newArr = (T[])new Object[count+2];
		else newArr = (T[])new Object[count]; 
		newArr[0] = value;
		for(int i=0; i<count+1; i++) {
			newArr[i+1] = list[i];
		}
		
		list = newArr;
		count++;
	}
	
	public void addLast(T value) {
		add(value);
	}
	
	public void remove(int idx) {
		if(idx >= count) {
			throw new IndexOutOfBoundsException();
		}
		T[] newArr =(T[]) new Object[count-1];
		for(int i=0; i<idx; i++) {
			newArr[i] = list[i];
		}
		for(int j=idx; j<count-1; j++) {
			newArr[j]= list[j+1];
		}
		list = newArr;
		count--;
	}
	
	public void remove(T o) {
		
		if(contains((T)o)){
			remove(indexOf((T)o));
		}
	}

	public void clear() {
		for(int i=0;i<count; i++) {
			remove(i);
		}
		count = 0;
	}
	
	public int indexOf(T value) {
		for(int i=0; i<count; i++) {
			if(list[i].equals(value))
				return i;
		}
		return -1;
	}
	
	public boolean contains(T value) {
		for(int i=0; i<count; i++) {
			if(list[i].equals(value)) {
				return true;
		}
		}
		return false;
	}
	
	public int search(T value) {
		if(contains(value)) {
			return indexOf(value);
		}
		return -1;
	}
	
	
	public void set(int idx, T value) {
		if(idx >= count) {
			throw new IndexOutOfBoundsException();
		}
		list[idx] = value;
	}
	
//	public <T extends Number> void sort() {
//		for(int i=0; i<count; i++) {
//			for(int j=0; j<count; j++) {
//				if(list[i] > list[j]) {
//					list[i] = list[j];
//				}
//			}
//		}
//		
//		return;
//	}
	
	public void print() {
		for(int i=0; i<count; i++) {
			System.out.println(list[i]);
		}
	}
	
	public int lastIndexOf(T value) {
		for(int i=(count-1); i>0; i--) {
			if(list[i] == value) {
				return count-i;
			}
		}
		return -1;
	}


//	@Override
//	public Iterator<T> iterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	public void addAll(Collection<? extends T> arr) {
		for(T i:arr) { 
			add(i);
		}
	} 
	
	public void removeAll(Collection<? extends T> arr) {
		for(T i:arr) {
			if(contains(i)) {
				remove(indexOf(i));
			}
		}
	}
	
	public void retainAll(T[] arr) {
		T[] newArr = (T[])new Object[count];
		int idx=0;
		for(int i=0; i<count; i++) {
			if(contains(arr[i])) {
				newArr[idx] = arr[i];
				idx++;
			}
		}
		list = newArr;
	}
	
	public void trimToEndSize() {
		size = count;
		list=Arrays.copyOf(list, size);
	}
	
	
	public T[] clone() {
		return list;
	}
	
	
	
}
