public class LinkedListProblems {
	public boolean isCircular(Node head){
		Node temp=head;
		while(true){
			if(temp.getNext()==null){
				return false;
				}
			
			if(temp.getNext()==head){
				return(true);
			}
					
		}
		
	}
	public String middleData(Node head){
		Node temp=head;
		Node middle=head;
		if(head!=null){
		   while(temp!=null&&temp.getNext()!=null){
			   temp=temp.getNext().getNext();
			   middle=middle.getNext();
			
		   }
		}
		return middle.getData();
		
	}
	public int getSize(Node head){
		Node temp=head;
		int n=1;
		if(head==null)
			return 0;
		if(temp.getNext()==null)
			return 1;
		while(temp.getNext()!=null&&temp.getNext().getNext()!=null){
			temp=temp.getNext().getNext();
			n++;
		}
		if(temp.getNext()==null){
			return(2*n-1);
		}
		else
			return(2*n);
	}

}
