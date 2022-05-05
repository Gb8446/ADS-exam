import java .util.Scanner;
class linkedlist{
 static Node head;
static class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

 static void reverse (){
	Node last=head;
	int count=1;
	while(last.next!=null){
		last=last.next;
		count++;
	}
	for(int j=1;j<=count;j++){
	last=head;
	int i=j;
	while(i<count){
		last=last.next;
		i++;
	}
	System.out.print(last.data+" ");
	}
	
}

 static void insert(int data){
	Node new_Node=new Node(data);
	if(head==null){
		head=new_Node;
		return;
	}else{
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		new_Node.next=null;
		last.next=new_Node;
	}
}
static void display(){
	Node n= head;
	while(n!=null){
		System.out.print(n.data+" ");
		n=n.next;
	}
	System.out.println();
}

public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Number of element");
	int i=sc.nextInt();
	for(int j=0;j<i;j++){
		insert(sc.nextInt());
	}
	display();
	reverse();
	
}
}