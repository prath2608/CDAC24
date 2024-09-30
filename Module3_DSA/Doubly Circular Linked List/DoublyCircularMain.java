package in.gov.ind.linkd.doubly.circular;

import java.util.Scanner;



class DoublyCricle{
	
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		
		
		Node(){}
		
		Node(int val){
			data = val;
			next = null;
			prev = null;
		}
		
	}
	
	private Node head;
	
	public DoublyCricle() {
		head = null;
	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	
	//1.dispalyForwad::
	
	public void displayForward() {
		Node trav = head;
		if(isEmpty()) {
			System.out.println("list is empty");
		}
		else {
			do {
				System.out.println(trav.data);
				trav = trav.next;
			}while (trav != head );
		}
		
		
	}
	
	//2.dispalyReverse::
	public void displayReverse() {
		Node trav = head;
		if(isEmpty()) {
			System.out.println("list is empty");
		}
		else {
			do {
				trav = trav.next;
			}
			while(trav.next != head);
			
			do {
				System.out.println(trav.data);
				trav =trav.prev;
			}while(trav != head.prev);
		}
	}
	
	
	//3. Add first Node::
	void addFirst(int val) {
		Node newNode = new Node(val);
		Node trav = head;
		
		if(isEmpty()) {
			head = newNode;
			newNode.next = head;
			newNode.prev = head;
		}
		else {
			while(trav.next != head) {
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.prev = trav;
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}	
	}
	
	
	//4. Add Last node::
	void addLast(int val) {
		Node newNode = new Node(val);
		Node trav = head;
		
		if(isEmpty()) {
			head = newNode;
			newNode.next = head;
			newNode.prev = head;
		}
			
		else {
			while(trav.next != head) {
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.prev = trav ; 
			newNode.next = head ;
			head.prev = newNode;
		}
	}
	

	// 5 add At Position::
	
	public void addAtPos(int val, int pos) {
		
		Node newNode = new Node(val);
		Node trav = head;
		
		if(isEmpty() || pos<=1) {
			addFirst(val);
		}
		
		
		
		else {
			for(int i = 1; i<pos-1; i++) {
				if(trav.next == head)
					break;
				
				trav = trav.next;
			}
			if(trav.next != head) {
				newNode.next = trav.next;
				trav.next.prev = newNode;
			}
			if(trav.next == head) {
				newNode.next = head;
				head.prev = newNode;
			}
			trav.next = newNode;
			newNode.prev = trav;
		}
		
		
		
		
		
	}
	
	
	
	//6. delete first
	void delFirst() {
		
		Node tail = head.prev;
		
		if(isEmpty())
			throw new RuntimeException("List is empty");
		
		if(head.next == head) {
			head = null;
		}
		
		else {
			head = head.next;
			head.prev = tail;
			
			tail.next = head;	
		}
		
	}
	
	//7 delete last::
	void delLast() {
		Node trav = head;
		
		if(isEmpty() )
			throw new RuntimeException("List is Empty");
		if(head == head.next)
			head = null;
		else {
			while(trav.next != head) {
				trav = trav.next;
			}
			trav.prev.next =head;
			head.prev = trav.prev;
			
		}
		
		
	}
	
	
	
	
	// 8 delete At Position
	void delAtPos(int pos) {
		Node trav = head;
		
		if(isEmpty())
			throw new RuntimeException("list is Empty:::");
		
		if(pos<=1) {
			head = null;
		}
		else {
			for(int i = 1; i<pos-1 ; i++) {
				
				trav = trav.next;
				
			}
			if (trav.next == head)
				throw  new RuntimeException("you Are going wrong:::");
			
			trav.next = trav.next.next;
			trav.next.prev = trav;
			
//			trav.next.prev = trav.prev;
//			trav.prev.next = trav.next; if(i<=pos-1)
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	//Delete All
	void delAll() {
		head = null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


public class DoublyCircularMain {
	
	
	
	
	private static Scanner sc = new Scanner(System.in);
	
	//menuList Program::
	public static int menuList() {
		System.out.println("0 for exit");
		System.out.println("1 for displayForward");
		System.out.println("2 for displayReverse");
		System.out.println("3 for addFirst");
		System.out.println("4 for addLast");
		System.out.println("5 for addAtPos");
		System.out.println("6 for delFirst");
		System.out.println("7 for delLast");
		System.out.println("8 for delAtPos");
		System.out.println("9 for delAll");
		int choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		
		
		
		
		
		DoublyCricle list = new DoublyCricle();
		int choice,val,pos;
		
		while((choice = DoublyCircularMain.menuList())!=0) {
			switch(choice) {
				case 1 : //display Forward::
					list.displayForward();
					break;
				case 2 : //Display Reverse::
					list.displayReverse();
					break;
				case 3 : //add First Node::
					val = sc.nextInt();
					list.addFirst(val);
					break;
				case 4 : //add Last Node::
					val = sc.nextInt();
					list.addLast(val);
					break;
				case 5 : //add At Position
					System.out.print("Enter Position:: ");
					pos = sc.nextInt();
					System.out.println("Enter Number:: ");
					val = sc.nextInt();
					list.addAtPos(val, pos);
					break;
				case 6 : // delete first::
					try {
						list.delFirst();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());;
					}
					break;
					
				case 7 ://delete Last::
				try {
					list.delLast();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.err.println(e.getMessage());;
				}
					break;
				case 8 :
					try {
						System.out.println("Enter Position:: ");
						pos=sc.nextInt();
						list.delAtPos(pos);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());;
					}
					break;
				case 9 ://delete all
					list.delAll();
					break;
			}	
		}
	}
}
