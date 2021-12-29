/*
	Design a data structure to store your contacts: Names of people along with their phone numbers.
	
	Phone book management have below operations:
	1.Add contact 
	2.Display all contacts 
	3.Search contact(By number) 
	4.Search contact(By name) 
	5.Edit contact
	6.Delete contact
	7.Clear all record 
	8.Terminate
	
*/
class Node
{
	String name , number;
	Node next;
	Node(String name, String number)
	{
		this.name=name;
		this.number=number;
		next=null;
	}
 }