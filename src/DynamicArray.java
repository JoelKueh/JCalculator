public class DynamicArray {
    String[] array;
    int count;
    int capacity;

    public void checkAndGrow(String oldArray) {
        if(count == capacity) {
            System.arraycopy(oldArray, 0, array, 0, capacity + 1 );
        }

        array[count] = oldArray;
        count++;
    }
}