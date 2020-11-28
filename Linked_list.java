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
System.out.print((head.next!=null)?"":"Null\n");
}
}
public static void delete(Node head, int pos){
   int point=1;
    while(point!=pos-1 && head.next!=null){
    point ++;
    head=head.next;
    }
    if(point!=pos-1||head.next.next==null)
    System.out.println("Invalid Position");
    else{
    Node p =head.next.next;
    head.next=p;
    }
}
public static void main(String args[]){
Node head = new Node(0);
Node point = head;
Scanner kb =new Scanner(System.in);
int choice =0;
while(choice!=-1){
System.out.println("Enter your Choice\n 1.Insert Node \n 2. Print All \n 3.To Delete A Node\n-1 To Exit");
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
    case 3:
    print(head.next);
    System.out.println("Enter The Position");
    int pos=kb.nextInt();
    delete(head.next,pos);
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