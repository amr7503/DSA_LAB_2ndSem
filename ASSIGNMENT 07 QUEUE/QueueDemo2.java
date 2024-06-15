import java.util.Scanner;

class Node
{
  int info;
  Node next;
}

public class QueueDemo2 {

  public static Node insert (Node rear, Node front) //adding an element x to the queue Q requires creation of node containing x and putting it next to the rear and rear points to the newly added element.
  {
     Node node=new Node();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter data to insert: ");
     node.info=sc.nextInt();

     if(front==null)
     {
       front=node;
       rear=node;
     }
    else{
       rear.next=node;
       rear=node;
    }
    return front;
  }
  
  public static Node delete (Node rear, Node front)  //deletes the front node from the queue Q
  {
    if(front==null) System.out.println("Queue is Empty(Underflow)");
    else{
      System.out.println("Node to be deleted: "+front.info);
      Node temp=front;
      front=front.next;
      temp.next=null;
    }
    if(front==null) rear=null;

    return front;
  }

  public static void display (Node rear, Node front) //display all the elements of the queue Q. 
  {
    Node temp=front;
    if(front==null) System.out.println("Queue is Empty");
    else{
      System.out.println("Elements of queue are:::: ");
      while(temp!=null)
      {
        System.out.print(temp.info+" ");
        temp=temp.next;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     Node rear=null,front=null;

    while(true)
    {
      System.out.println("****MENU****");
      System.out.println("0:Exit");
      System.out.println("1:Insert");
      System.out.println("2:Delete");
      System.out.println("3:Display");
      System.out.println("Enter your choice");
      int choice=sc.nextInt();
      switch(choice)
      {
        case 0:
          System.exit(0);

        case 1:
          front=insert(rear,front);
          break;

        case 2:
          front=delete(rear,front);
          break;
        case 3:
          display(rear,front);
          break;
        default:
          System.out.println("Wrong choice");
      }//switch
    }//while
  }//main
}//class