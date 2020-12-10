import java.io.*;
import java.util.*;
class circular_queue{
static int queue[]= new int[10];
static final int max=9;
static int front=-1,rear=-1;
void push(int data){
if(front==0&&rear==max||rear==front-1)
System.out.println("Queue OverFlow");
else if(rear==max){
rear=0;
queue[rear]=data;
}
else{
rear+=1;
queue[rear]=data;
if(front==-1)
front+=1;
}
}
void pop(){
if(front==-1&&rear==-1)
System.out.println("Queue UnderFlow");
if(front==rear){
front=rear=-1;
}
else if(front==max){
    front=0;
}
else{
front+=1;
}
}
void print(){
    if(rear>front){
    for(int i=front;i<=rear;i++){
    System.out.print(queue[i]+" ");
    }
    if(rear==front)
    System.out.print(queue[rear]);
    }
    if(front>rear){
    for(int i=front;i<=max;i++)
    System.out.print(queue[i]+" ");
    for(int i=0;i<=rear;i++)
    System.out.print(queue[i]+" ");
    }
    if(front==-1&&rear==-1)
    System.out.println("Queue Empty ");
}
public static void main(String args[]){
int choice=0;
circular_queue cq = new circular_queue();
System.out.println("--------------------------------------------------------------------------------------------");
System.out.println("                                 CIRCULAR QUEUE                                             ");
System.out.println("--------------------------------------------------------------------------------------------");

while(choice!=-1){
    try{
System.out.println("1.Push \n2.Pop \n3.Print\n -1 Exit");
Scanner kb = new Scanner(System.in);
choice =kb.nextInt();
switch(choice){
case 1:
System.out.println("Enter The Data");
int data= kb.nextInt();
cq.push(data);
break;
case 2:
cq.pop();
break;
case 3:
cq.print();
case -1:
break;
default:
   System.out.println("Wrong Choice");
}

}
catch(InputMismatchException ime){
    System.out.println("Incorrect Input");
    choice =0;
}
}
}
}