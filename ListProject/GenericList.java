package ListProject;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericList<T> {

	private T[] values;
	private int capacity;
	
	public GenericList() {
		values = (T[]) Array.newInstance(GenericList.class, 10);
		capacity = 10;
	}
	
	public GenericList(int size) {
		values = (T[]) Array.newInstance(GenericList.class, size);
		capacity = size;
	}
	
	
	public int isFreeSpace() {
		int result = 0;
		
		int i = 0;
		while(i < values.length) {
			if(values[i] == null ) {
				result = i;
				break;
			}

			i++;
		}
		
		return result;
	}
	
	public void add(T value) {
		int index = isFreeSpace();
		if(index == values.length - 1) {
			values[index] = value;
		}
		else {
			T[] newArr = Arrays.copyOf(values, capacity * 2);			
			this.values = newArr;
			values[index] = value;
		}
	}
	
	public int getSize() {
		return this.values.length;
	}
	 
	public int getCapacity() {
		return this.capacity;
	}
	
}
