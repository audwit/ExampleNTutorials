package LinkedList;

public class LinkedList
{
	ListElement head,tail;
	public void insertLink(ListElement lElement)
	{
		// When there is data in LinkedList
		if(head != null)
		{
			tail.setNext(lElement);
			tail = lElement;
		}
		// When the linked list is empty
		else
			{
				head = lElement;
				tail = lElement;
			}
	}
	
	public void display()
	{
		ListElement temp;
		temp = head;
		if(head != null)
			while(temp != null)
				{
					System.out.print(temp.getVal() +",");
					temp = temp.getNext();
				}
	}
	public static void main(String[] args)
	{
		LinkedList linkedList = new LinkedList();
		linkedList.insertLink(new ListElement(10));
		linkedList.insertLink(new ListElement(13));
		linkedList.insertLink(new ListElement(15));
		linkedList.insertLink(new ListElement(19));
		
		linkedList.display();
		//System.out.println("done");
		
		
	}
}