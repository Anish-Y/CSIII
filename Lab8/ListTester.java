/**
 *	Use the main method of this class to test your MyArrayList methods
 *	as you write them.
 *
 *	You should implement the add(Object) and size() methods first. Below is a quick test
 *	to make sure that add(Object) and size() work properly.
 *
 *	As you implement more methods, write some code in this main method to make sure
 *	it works correctly. Be sure to test edge cases like 
 *		- "what if the list is empty"
 *		- "what if the list is not empty"
 *		- "does it work on the first element" 
 *		- "does it work on the last element"
 *		- "does it work on an element in the middle"
 */
public class ListTester
{
	public static void main(String[] args)
	{
		//Create a MyArrayList to test
		MyList list = new MyArrayList();
		
		list.remove(0);
		System.out.println(list.isEmpty());
		System.out.println(list.toString());
	}
}