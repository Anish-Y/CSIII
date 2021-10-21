public class IntegerArrayList extends MyArrayList implements IntegerList
{
    public boolean add(Object obj)
	{
		if(!(obj instanceof Integer)) return false;
		//Do whatever MyArrayList does for this method
		return super.add(obj);
	}
	
	/**
	 *	If obj is *not* an instanceof a String then this method should
	 *	NOT add obj to the list and it should return false.
	 *	Otherwise, it should do whatever MyArrayList does for this method.
	 */
	public void add(int index, Object obj)
	{
		//Do whatever MyArrayList does for this method
		if(obj instanceof Integer) super.add(index, obj);
	}
	
	/**
	 *	If obj is *not* an instanceof a String then this method should
	 *	NOT set the value at index to obj and it should reutnr null.
	 *	Otherwise, it should do whatever MyArrayList does for this method
	 */
	public Object set(int index, Object obj)
	{
		if(!(obj instanceof Integer)) return null;
		//Do  whatever MyArrayList does for this method
		return super.set(index, obj);
	}


    public Integer getInt(int index) {
        Object obj = get(index);
		return obj != null? (Integer) obj: null;
    }

    public Integer removeInt(int index) {
		Object obj = remove(index);
		return obj != null? (Integer) obj: null;
    }

    public Integer setInt(int index, Integer str) {
		Object obj = set(index, str);
		return  obj != null? (Integer) obj: null;
    }

}