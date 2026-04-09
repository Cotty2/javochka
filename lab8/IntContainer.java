
public class IntContainer {
    private int[] arr;
    private int size;
    
    public IntContainer() {
        arr = new int[3];
        size = 0;
    }
    
    public void push(int value) throws ContainerFullException {
        if (size >= arr.length) {
            throw new ContainerFullException("Контейнер заполнен");
        }
        arr[size++] = value;
    }
    
    public int pop() throws ContainerEmptyException {
        if (isEmpty()) {
            throw new ContainerEmptyException("Контейнер пуст");
        }
        return arr[--size];
    }

    public void sort() throws ContainerEmptyException, SortException {
        if (isEmpty()) {
            throw new ContainerEmptyException("Контейнер пуст");
        }
        
        boolean allEqual = true;
        for (int i = 1; i < size; i++) {
            if (arr[i] != arr[0]) {
                allEqual = false;
                break;
            }
        }
        
        if (allEqual) {
            throw new SortException("Все элементы равны");
        }
        
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < size) {
                sb.append(arr[i]);
            } else {
                sb.append("null");
            }
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}