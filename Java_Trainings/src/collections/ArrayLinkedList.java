package collections;

import java.util.LinkedList;

public class ArrayLinkedList {

	public static void main(String[] args) {
		//ArrayList - index numbers 0 1 2 3 
			//so insertion and deletion take time to shift index numbers
			//so AL preferred when only traversing there 
		//LinkedList - Nodes
			//insertion and deletion take less time 
			//because its easy manage nodes using address
		
		//2nd Difference
			//LinkedList have some extra methods as compared to ArrayList
			//to work on Stack, Queue, DeQueue etc
		
			//Stack (LIFO - Last in first out) push pop
			//insert 33,45,67,12 (insert at last)
			//delete 33,45,67 (delete at last inserted)
			
			//Queue (FIFO)
		
		LinkedList<Integer> list=new LinkedList<>();
		System.out.println(list);
		
		list.push(34);
		list.push(4);
		list.push(13);
		System.out.println(list);
		
		list.pop();
		System.out.println(list);
		
		LinkedList<Integer> q=new LinkedList<>();
		q.addLast(23);
		q.addLast(12);
		q.addLast(34);
		System.out.println(q);
		q.removeFirst();
		System.out.println(q);
		

	}

}
