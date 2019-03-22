import java.util.ArrayList;
public class ArrayQueue<T> implements Queue<T>{
	int size = 0;
	ArrayList<T> arr = new ArrayList<T>();
	public T dequeue(){
		T item = arr.get(0);
		arr.remove(0);
		size--;
		return item;
	}

	public void enqueue(T item){
		arr.add(item);
		size++;
	}

	public boolean empty(){
		if(size == 0){
			return true;
		}
		return false;
	}
}