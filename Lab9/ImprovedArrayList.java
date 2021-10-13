public class ImprovedArrayList implements MyList
{
    private int size;
    private Object[] data;
    
    public ImprovedArrayList()
    {
        // Let the other constructor do the work!
        this(0);
    }

    public ImprovedArrayList(int x)
    {
        size = 0;
        data = new Object[x];
    }

    /**
     *	Add obj to the end of the list.
     *	This method always returns true
     */
    public boolean add(Object obj)
    {


        return false;		
    }

    /**
     *	Add obj to the specified index of the list.
     *	If index is too big, then add obj to the end of the list
     *	If index is too small, then add obj to the start of the list
     */
    public void add(int index, Object obj)
    {

    }

    /**
     *	Return true is this list contains something that is .equals() to obj
     */
    public boolean contains(Object obj)
    {

        return false;
    }

    /**
     *	Return the Object located at the specified index
     *	If index is too big or too small, return null
     */
    public Object get(int index)
    {

        return null;
    }

    /**
     *	Return true if there are no elements in the list
     */
    public boolean isEmpty()
    {
        return false;
    }

    /**
     *	Remove the Object at the specified index from the list
     *	Return the Object that was removed
     *	If index is too big or to small, do not remove anything from the list and return null
     */
    public Object remove(int index)
    {

        return null;
    }

    /**
     *	Remove the first Object that is .equals() to obj
     *	Return true if an object was removed
     */
    public boolean remove(Object obj)
    {
        //HINT:  Find the index of obj and then call remove(int index)

        return false;
    }

    /**
     *	Change the value stored at index to obj
     *	Return the value that was replaced
     *	If index is too big or too smalll, do not change and values and return null
     */
    public Object set(int index, Object obj)
    {
        return null;
    }

    /**
     *	Return the number of elements that are in the list
     */
    public int size()
    {
        // HINT:  Do you have a variable that holds the size?
        return -1;
    }
}