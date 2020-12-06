import java.io.*;
import java.util.*;
public class circular_queue{
public static Node push(int data){
Node new_node = new Node();
new_node.data=data;
return new_node;
}
public static Node pop(Node front){
if(front.next!=null)
return front.next;
else
return null;
}
public static void print(Node front){
    Node ptr=front;
    try{
    do{
     System.out.print(ptr.data+"->");
        ptr=ptr.next;
    }
    while(ptr!=null);
System.out.println();
}
catch(NullPointerException e){
     System.out.println();
}
}
 public static void main(String args[]){
Node front;
Node rear;
front = rear =null;
int choice=0;
Scanner kb = new Scanner(System.in);
System.out.println("--------------------------------------------------------------------------------------------");
System.out.println("                                  CIRCULAR QUEUE                                            ");
System.out.println("--------------------------------------------------------------------------------------------");
while(choice!=-1){
System.out.println("1.Push \n2.Pop \n3.Print\n -1 Exit");
choice =kb.nextInt();
switch(choice){
case 1:
System.out.println("Enter The Data");
int data= kb.nextInt();
if(rear==null)
rear=push(data);
if(rear!=null){
rear.next=push(data);
rear=rear.next;
}
if(front==null)
front=rear;
break;
case 2:
front=pop(front);
break;
case 3:
if(front==null)
System.out.println("Queue Empty");
else
print(front);
case -1:
break;
default:
   System.out.println("Wrong Choice");
}
}
 }
}
class Node{
int data;
Node next=null;
}