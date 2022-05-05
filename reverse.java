import java.util.Scanner;

  class Node{
 int data;
 Node next;
  Node(int d){
  this.data=d;
  this.next=null;
  }
  }
 public class reverse{
  Node head;
  
  void Display(Node head){
  Node temp=head;
  System.out.print("head-> ");
  while(temp!=null){
  System.out.print(temp.data+"->");
  temp=temp.next;
  }
  System.out.println("null");
  }
  public void addLast(Node data)
  {
  if(head==null){
  head=data;
  }
  else{
  Node temp=head;
  while(temp.next!=null){
  temp=temp.next;
  }
  temp.next=data;
  }
  }
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  reverseClass list=new reverseClass();
  System.out.println("enter the size");
  int n=sc.nextInt();
  reverse list1=new reverse();
  System.out.println("Enter the data");
  int a1=sc.nextInt();
  Node head=new Node(a1);
  list1.addLast(head);
  for(int i=1;i<n;i++){
  int a=sc.nextInt();
  list1.addLast(new Node(a));
  }
  System.out.println("Before reverse");
  list1.Display(head);
 Node head2=null;
  System.out.println("after reverse");
  head2=list.reverse(head);
  list1.Display(head2);
  }
  }
  class reverseClass 
  {
	  Node reverse(Node head)
  {
  Node temp=head;
  Node prev=null;
  Node n=head.next;
  while(n!=null){
  temp.next=prev;
  prev=temp;
  temp=n;
  n=n.next;
 
  }
  temp.next=prev;
  head=temp;
  return head;
  }
  }
  
  
 