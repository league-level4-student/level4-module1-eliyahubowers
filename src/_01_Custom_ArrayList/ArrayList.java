package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{

	T[] list;
	
	public ArrayList() {
		this.list = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return this.list[loc];
	}
	
	public void add(T val) {
		T[] list2 =(T[])new Object[this.list.length+1];
		for(int i = 0; i < this.list.length; i++) {
			list2[i] = this.list[i];
		}
		list2[this.list.length] = val;
		this.list = list2;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] list2 =(T[])new Object[this.list.length+1];
		for(int i = 0; i < loc; i++) {
			list2[i] = this.list[i];
		}
		list2[loc] = val;
        for(int i = loc+1; i < list2.length; i++) {
        	list2[i] = this.list[i-1];
		}
		this.list = list2;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		this.list[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] list2 =(T[])new Object[this.list.length-1];
		for(int i = 0; i < loc; i++) {
			list2[i] = this.list[i];
		}
		for(int i = loc+1; i < this.list.length; i++) {
			list2[i-1] = this.list[i];
		}
		this.list = list2;
	}
	
	public boolean contains(T val) {
		for(int i = 0; i < this.list.length; i++) {
			if(this.list[i] == val) {
				return true;
			}
		}
		return false;
	}
	
	public int size(){
		return this.list.length;
	}
	
}