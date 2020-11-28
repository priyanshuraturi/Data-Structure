import java.io.*;
import java.util.Scanner;
class Linked_list{
public static Node insert(int data){
Node new_node = new Node(data);
return new_node;
}
public static void print(Node head){
while(head.next!=null){
System.out.print(head.data+" -> ");
head=head.next;
System.out.print((head.next!=null)?"":"Null");
}
}
public static void main(String args[]){
Node head = new Node(0);
Node point = head;
Scanner kb =new Scanner(System.in);
int choice =0;
while(choice!=-1){
System.out.println("Enter your Choice\n 1.Insert Node \n 2. Print All");
choice = kb.nextInt();
switch(choice){
    case 1:
        System.out.println("Enter The Data");
        int data=kb.nextInt();
        point.next=insert(data);
        point=point.next;
        break;
    case 2:
        print(head.next);
        break;
    case -1:
        break;
    default:
    System.out.println("Invalid choice");
    }
}

}
}
class Node{
int data;
Node next;
public Node(int data){
this.data=data;
this.next=null;
}
}