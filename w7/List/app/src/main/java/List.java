package list;

public class List {
	int arr[];
	int count;
	public List(int count) {
		arr = new int[count];
		this.count = count;
	}

	public List() {
		arr = new int[0];
		this.count = 0;
	}

	// relocate and add an element
	public void add(int number) {
		int newArr[] = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		} 	
		arr = newArr;

		arr[count++] = number;
	}

	public int get(int index) {
		if (index >= arr.length || index < 0) { return -1;}
		return this.arr[index];	
	}

	// remove an element and relocate
	// the parameter for the method is an index, feel free to modify it to use the value instead
	public void remove(int number) {
		int newArr[] = new int[arr.length - 1];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
		if (arr[i] == number) {
				continue;
			}
			newArr[count] = arr[i];
			++count;
		} 	
		arr = newArr;
	}

	// remove the lastest element
	public void remove() {
		int newArr[] = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			newArr[i] = arr[i];
		} 	
		arr = newArr;
	}
}
