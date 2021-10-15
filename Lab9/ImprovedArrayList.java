import java.util.*;

public class ImprovedArrayList implements MyList {
    private int size;
    private Object[] data;

    public ImprovedArrayList() {
        // Let the other constructor do the work!
        this(0);
    }

    public ImprovedArrayList(int x) {
        size = 0;
        data = new Object[x];
    }

    /**
     * Add obj to the end of the list. This method always returns true
     */
    public boolean add(Object obj) {
        if (size == 0)
            data = new Object[1];
        else if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }

        data[size] = obj;
        size++;
        return true;
    }

    /**
     * Add obj to the specified index of the list. If index is too big, then add obj
     * to the end of the list If index is too small, then add obj to the start of
     * the list
     */
    public void add(int index, Object obj) {
        

        if (index >= size) {
            add(obj);
            return;
        }
        if (index > size)
            index = 0;

        
        if (size == 0)
            data = new Object[1];
        else if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = obj;
        size++;
    }

    /**
     * Return true is this list contains something that is .equals() to obj
     */
    public boolean contains(Object obj) {
        for (Object o : data)
            if (o != null && o.equals(obj))
                return true;
        return false;
    }

    /**
     * Return the Object located at the specified index If index is too big or too
     * small, return null
     */
    public Object get(int index) {
        if(outOfBounds(index)) return null;
        return data[index];
    }

    /**
     * Return true if there are no elements in the list
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Remove the Object at the specified index from the list Return the Object that
     * was removed If index is too big or to small, do not remove anything from the
     * list and return null
     */
    public Object remove(int index) {

        if(outOfBounds(index)) return null;

        Object old = data[index];

        for(int i = index; i < size; i++){
            if(i+1 < size) data[i] = data[i+1];
            else data[i] = null;
        }

        size --;
        return old;
    }

    /**
     * Remove the first Object that is .equals() to obj Return true if an object was
     * removed
     */
    public boolean remove(Object obj) {
        for(int i = 0; i < size; i++){
            if(data[i].equals(obj)){
                remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Change the value stored at index to obj Return the value that was replaced If
     * index is too big or too smalll, do not change and values and return null
     */
    public Object set(int index, Object obj) {
        if(outOfBounds(index)) return null;
        Object old = data[index];
        data[index] = obj;
        return old;
    }

    /**
     * Return the number of elements that are in the list
     */
    public int size() {
        return size;
    }

    private boolean outOfBounds(int index) {
        return index < 0 || index >= size;
    }

    @Override
    public String toString(){
        return Arrays.toString(data);
    }
}