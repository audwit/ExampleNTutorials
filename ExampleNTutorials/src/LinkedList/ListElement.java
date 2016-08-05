package LinkedList;

public class ListElement
{
	private int val;
	private ListElement next;
	
	public ListElement(int data)
	{
		this.val =data;
		this.next = null;
	}
	public int getVal()
	{
		return val;
	}
	public void setVal(int val)
	{
		this.val = val;
	}
	public ListElement getNext()
	{
		return next;
	}
	public void setNext(ListElement next)
	{
		this.next = next;
	}

	
}
