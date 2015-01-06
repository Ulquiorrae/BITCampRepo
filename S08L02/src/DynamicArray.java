public class DynamicArray {

	private int[] array;
	private int count;
	final int INIT_SIZE = 5;

	public DynamicArray(int size) {
		this.array = new int[size];
		this.count = 0;
	}

	public DynamicArray() {
		this.array = new int[INIT_SIZE];
		this.count = 0;
	}

	public int getSize() {
		return count;
	}

	// public void add(int newElement){
	// if(this.count == array.length){
	// resize();
	// array[count] = newElement;
	// }
	//
	// }
	//
	// private void resize(){
	// int[] temp = new int[2*array.length];
	// for(int i=0; i< count; i++){
	// temp[i] = array[i];
	// }
	// array = temp;
	// }

	public void add(int newElement) {
		if (count == array.length)
			resize();
		array[count] = newElement;
		count++;
	}

	private void resize() {
		int[] tmp = array;
		array = new int[tmp.length * 2];
		for (int i = 0; i < count; i++) {
			array[i] = tmp[i];
		}
	}

	private int getAt(int index) {

		if (index > count || index < 0) {
			throw new IndexOutOfBoundsException();
		} else {
			return array[index];
		}
	}

	private void removeAt(int index) {

		if (index > count || index < 0) {
			throw new IndexOutOfBoundsException();
		} else {
			for (int i = index; i < array.length - 1; i++) {
				array[i] = array[i + 1];

			}
			count--;
		}
	}

	private int[] toArray() {
		int[] newArray = new int[count];
		for (int i = 0; i < count; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}

}
