import java.util.ArrayList;
public class ArrayStack<T> implements Stack<T>{
	int size = 0;
	ArrayList<T> arr = new ArrayList<T>();
	public void push(T item){
		arr.add(item);
		size++;
	}

	public T pop(){
		T item = arr.get(size-1);
		arr.remove(size-1);
		size--;
		return item;
	}
	public T peek(){
		if(size == 0){
			return null;
		}
		return arr.get(size-1);

	}
	public boolean empty(){
		if(size == 0){
			return true;
		}
		return false;
	}
}