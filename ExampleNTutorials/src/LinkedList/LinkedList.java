package LinkedList;

public class LinkedList
{
	ListElement head,tail;
	public void insertLink(ListElement lElement)
	{
		// When there is data in LinkedList
		if(head != null)
		{
			tail.next = lElement;
			tail = lElement;
		}
		// When the linked list is empty
		else
			{
				head = lElement;
				tail = lElement;
			}
	}
	
	public void display(LinkedList lList)
	{
		ListElement temp;
		temp = lList.head;
		if(lList.head != null)
			while(temp != null)
				{
					System.out.print(temp.val +",");
					temp = temp.next;
				}
	}
	public static void main(String[] args)
	{
		LinkedList linkedList = new LinkedList();
		linkedList.insertLink(new ListElement(10));
		linkedList.insertLink(new ListElement(13));
		linkedList.insertLink(new ListElement(15));
		
		linkedList.display(linkedList);
		//System.out.println("done");
		
		
	}
}