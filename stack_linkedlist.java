import java.io.*;
import java.util.*;
public class stack_linkedlist{
public static node push(int data){
node new_node = new node();
new_node.data=data;
new_node.next = null;
return new_node;
}
public static void pop(node head){
if(head==null){
System.out.println("Stack UnderFlow");
}
if(head.next==null){
head=null;
}
    else{
 node ptr = head;
while(ptr.next.next!=null){
    ptr=ptr.next;
}
ptr.next=null;
}
}
public static void print(node head){
node ptr = head;
    while(ptr!=null){
    System.out.print(ptr.data+"->");
    ptr=ptr.next;
}
System.out.print("null\n");
}
public static void main(String args[]){
Scanner kb = new Scanner(System.in);
int choice =0;
node head = new node(); 
node ptr =head;
while(choice!=-1){
System.out.println("Enter Your Choice\n1.Push\n2.Pop\n3.Print\n-1.Exit");
choice=kb.nextInt();
switch(choice){
case 1:
      System.out.print("Enter the Data:\t");
      int data=kb.nextInt();
      ptr.next=push(data);
      ptr=ptr.next;
      break;
case 2:
    pop(head.next);
case 3:
    print(head.next);
case -1:
    break;
default:
    System.out.println("Wrong Choice");
}
}
}
}
class node{
int data;
node next;
}
 