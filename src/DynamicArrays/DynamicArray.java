package DynamicArrays;

public class DynamicArray {

    int size;
    int capacity =10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {

        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {

        if (size >= capacity) {
            grow();
        }

        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {

        if (size >= capacity) {
            grow();
        }

        //Shifting the elements one index forward
        for (int i = size; i > index; i--){
            array[i] = array[i - 1];
        }

        //setting the new object
        array[index] = data;
        //Increasing size
        size++;
    }

    public void delete(Object data) {

        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                for (int j = 0; j < (size - i - 1); j++) {

                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;

                //Reducing the capacity of our array if the size is below 1/3 capacity
                if (size <= (int)(capacity/3)) {
                    shrink();
                }

                break;
            }
        }

    }

    public int search(Object data) {

        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return 1;
            }
        }

        return -1;
    }

    public void grow() {

        int newCapacity = (int)(capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++){

            newArray[i] = array[i];
        }

        capacity = newCapacity;
        array = newArray;
    }

    public void shrink() {

        int newCapacity = (int)(capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++){

            newArray[i] = array[i];
        }

        capacity = newCapacity;
        array = newArray;

    }

    public Boolean isEmpty() {

        return size == 0;
    }

    public String toString() {

        String string = "";

        for (int i =0; i < capacity; i++) {
            string += array[i] + ", ";
        }

        if (!string.equals("")) {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }

        return string;
    }

}
