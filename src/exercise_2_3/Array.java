package exercise_2_3;


public class Array<E> {

    private final E[] data;

    public Array(E[] array) {
        data = array;
    }

    public E get(int index) {
        if (index >= 0 && index < data.length) {
            return data[index];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public int getLength() {
        return data.length;
    }
}
