import java.util.Arrays;

public class Array<T> {

    private T[] elementData;
    private int size;

    public Array(int size) {

        elementData = (T[]) new Object[size];;
    }

    public Array() {
        this(10);
    }

    public T get(int index) {
        rangeCheck(index);

        return elementData[index];
    }

    public boolean add(T e) {
        ensureCapacity(size + 1);
        elementData[size++] = e;
        return true;
    }

    public boolean contains(T o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(T o) {

        for (int i = 0; i < size; i++) {
            if (o == elementData[i]) {
                return i;
            }
        }

        return -1;
    }

    public void ensureCapacity(int minCapacity) {

        int oldCapacity = elementData.length;
        if (minCapacity > oldCapacity) {
            
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            System.out.println("The capacity is doubled. Current capacity: "+ newCapacity);
            //copy array. You can make it by iterating as well.
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }

    private void rangeCheck(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException(
                    "Index: " + index + ", Size: " + size);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public String toString() {
        if (elementData == null)
            return "null";

        int iMax = elementData.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(String.valueOf(elementData[i]));
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
    
    
}
