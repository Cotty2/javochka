public class GenericStack<E> {
    private static final int INITIAL_SIZE = 5;
    private E[] arr;
    private int size;
    
    public GenericStack() {
        arr = (E[]) new Object[INITIAL_SIZE];
        size = 0;
    }
    
    public int getSize() {
        return size;
    }
    
    public int getCapacity() {
        return arr.length;
    }
    
    public E peek() {
        return arr[size - 1];
    }
    
    public void push(E o) {
        if (size == arr.length) {
            E[] newArr = (E[]) new Object[arr.length * 2];
            for (int i = 0; i < size; i++)
                newArr[i] = arr[i];
            arr = newArr;
        }
        arr[size++] = o;
    }
    
    public E pop() {
        E o = arr[--size];
        arr[size] = null;
        return o;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                sb.append("null");
            else
                sb.append(arr[i]);
            
            if (i < arr.length - 1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}