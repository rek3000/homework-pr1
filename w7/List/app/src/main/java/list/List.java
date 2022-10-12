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

	public void add(int number) {
		int newArr[] = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		} 	
		arr = newArr;

		arr[count++] = number;
	}

	public void get(int index) {

	}
}
