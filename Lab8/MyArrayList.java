import java.util.*;

public class MyArrayList implements MyList {

    Object[] data;

    public MyArrayList() {
        data = new Object[0];
    }

    @Override
    public boolean add(Object obj) {
        add(size(), obj);
        return true;
    }

    @Override
    public void add(int index, Object obj) {
        if (index < 0)
            index = 0;
        if (index > size())
            index = size();
        Object[] newArr = new Object[size() + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index)
                newArr[i] = data[i];
            else if (i == index)
                newArr[i] = obj;
            else
                newArr[i] = data[i - 1];
        }
        data = newArr;
    }

    @Override
    public boolean contains(Object obj) {
        for (int i = 0; i < data.length; i++)
            if (data[i].equals(obj))
                return true;
        return false;
    }

    @Override
    public Object get(int index) {
        if (isOutOfBounds(index))
            return null;
        return data[index];
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Object remove(int index) {
        if (isOutOfBounds(index))
            return null;
        if (data.length == 0)
            return null;

        Object[] newArr = new Object[data.length - 1];
        Object old = null;

        for (int i = 0; i < data.length; i++) {
            if (i < index)
                newArr[i] = data[i];
            else if (i == index)
                old = data[i];
            else
                newArr[i - 1] = data[i];
        }
        data = newArr;
        return old;
    }

    @Override
    public boolean remove(Object obj) {
        for (int i = 0; i < data.length; i++)
            if (data[i].equals(obj)){
                remove(i);
                return true;
            }
        return false;
    }

    @Override
    public Object set(int index, Object obj) {
        if (isOutOfBounds(index))
            return null;
        Object ret = data[index];
        data[index] = obj;
        return ret;
    }

    @Override
    public int size() {
        return data.length;
    }

    private boolean isOutOfBounds(int index) {
        return index < 0 || index >= data.length;
    }
    
    @Override
    public String toString(){
        return Arrays.toString(data);
    }
}
