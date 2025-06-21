package dsa;

import java.util.ArrayList;

public class singlylinkedlist {
    Node head;
    Node tail;
    int size;
    class Node{
    	int data;
    	Node next;
    	public Node(int data) {
    	this.data=data;	
    	}
    	Node(int data,Node next){
    		this.data=data;
    		this.next=next;
    	}
    }
    	public boolean isEmpty() {
    		return head==null && tail==null?true:false;
    	}
    	public int size() {
    		return size;
    	}
    	public boolean append(int data) {
    		Node node=new Node(data);
    		if(isEmpty()) {
    			head=node;
    			tail=node;
    		}
    		else {
    			tail.next=node;
    			tail=node;
    		}
    		return true;
    	}
    	public boolean prepend(int data) {
    		Node node=new Node(data);
    		if(isEmpty()) {
    			head=node;
    			tail=node;
    		}else {
    			node.next=head;
    			node=head;
    		}
    		return true;
    		
    	}
    	public void insert(int data,int index) {
    		if(index==0)   { 
    			 prepend(data);
    			 return;
    		}
    		if(index==size) {
    			append(data);
    			return;
    		}   
    		Node temp=head;
    		for(int i=1;i<index;i++) {
    			temp=temp.next;
    		 }
    		Node node=new Node(data,temp.next);
    		temp.next=node;
    		size++;
    	}
    	public void print() {
    		Node temp=head;
    		while(temp!=null) {
    			System.out.println(temp.data);
    			temp=temp.next;
    		}
    		
    	}
    	public boolean deletefirst() {
    		if(isEmpty()) {
    			head=null;
    			tail=null;
    			}
    		else {
    			head=head.next;
    		}
    		size--;
    		return true; 
    	}  
    	ArrayList<Integer> al=new ArrayList<>(); 
    	
    }

	
