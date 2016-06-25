import java.util.Scanner;
class Node{
	private Node next;
	private String data;
	Node(String value){
		this.data=value;
		this.next=null;
		}
	Node getNext(){
		return(next);
	}
	void setNext(Node link){
		next=link;	
	}
	String getData(){
		return(data);
	}
	void setData(String value){
		data=value;	
	}
	
}
class LinkedList{
	private int size;
	private Node start;
	LinkedListProblems ob=new LinkedListProblems();
	LinkedList(){
		this.size=0;
		this.start=null;
	}
	int getSize(){
		
		return (ob.getSize(start));
		
	}
	void display(){
		Node tmp=start;
		while(tmp!=null){
			System.out.println(tmp.getData());
			tmp=tmp.getNext();
		}
	}
	void insertAtBegining(String value){
		Node nptr=new Node(value);
		if(start==null){
			start=nptr;
			start.setNext(null);
			size++;
		}
		else{
			nptr.setNext(start);
			start=nptr;
			size++;
		}	
	}
	void insertAtEnd(String value){
		Node nptr =new Node(value);
		if(start==null){
			start=nptr;
			start.setNext(null);
			size++;
		}
		else{
			Node temp=start;
			while(temp.getNext()!=null){
				temp=temp.getNext();
			}
			temp.setNext(nptr);
			size++;
		}
	}
	void insertAtMiddle(String value,int pos){
		if(pos>1&&pos<=size){
			Node nptr =new Node(value);
			Node tmp=start;
			for(int i=1;i<pos-1;i++){
				tmp=tmp.getNext();
			}
			Node tmp1=tmp.getNext();
			tmp.setNext(nptr);
			nptr.setNext(tmp1);
			size++;
		}
		else{
			System.out.println("wrong position enter");
		}
	}
	void delete(int pos){
		if(pos<1&&pos>size){
			System.out.println("wrong choice");
		}
		else if(pos==1){
			start=start.getNext();
			size--;
		}
		else{
			Node tmp=start;
			for(int i=1;i<pos-1;i++){
				tmp=tmp.getNext();
			}
	        tmp.setNext((tmp.getNext()).getNext());
			
			
		}
		
	}
	String middleElement(){
		return (ob.middleData(start));
	}
}
public class TestLinkedList {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		LinkedList obj=new LinkedList();
		char ch;
		do{
			System.out.println("Linked List operation LIst:");
			System.out.println("enter 1 for insert a node at begning ");
			System.out.println("enter 2 for insert a node at end");
			System.out.println("enter 3 for get the size of Linked List");
			System.out.println("enter 4 for display");
			System.out.println("enter 5 for insert Node at middle");
			System.out.println("enter 6 for delete");
			System.out.println("enter 7 for getting middle element");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch(choice){
			case 1 :
				System.out.println("enter data");
				obj.insertAtBegining(sc.next());
				System.out.println(" Linked List is as folloSws");
				obj.display();
				break;
			case 2 :
				System.out.println("enter data");
				obj.insertAtEnd(sc.next());
				System.out.println(" data");
				obj.display();
				break;
			case 3 :
				System.out.println("size of linked list is "+ obj.getSize());
				break;
			case 4 :
				if(obj.getSize()==0){
					System.out.println("no item in Linked List ");	
				}
				else{
					System.out.println("list is");
					obj.display();
				}
				break;
			case 5:
				System.out.println("enter data");
				System.out.println("enter position");
				obj.insertAtMiddle(sc.next(),sc.nextInt());
				System.out.println("data");
				obj.display();
				break;
			case 6 :
				System.out.println("insert position where u want to delete");
				obj.delete(sc.nextInt());
				System.out.println("list is as ");
				obj.display();
			case 7 :
				System.out.println("middle element of linked list is: "+obj.middleElement());
				
		    default:
		    	System.out.println("wrong choice");
		    	break;
			}
			System.out.println("for continue enter y");
		    ch =sc.next().charAt(0);	
		}while(ch==('y')||ch=='Y');
		
		
	}
}