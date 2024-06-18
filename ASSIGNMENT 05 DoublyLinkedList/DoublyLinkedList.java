import java.util.Scanner;
class Node
{
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;
    Node(int reg,float mark){
        this.regd_no=reg;
        this.mark=mark;
    }
    Node(){}

}
public class DoubleLinkedList {
	public static Node start = null;
	public static Node end= null;
	public static Scanner sc=new Scanner(System.in);
	
    public static void main(String[] args) {
        
        /*
        Node start=new Node();
        start.regd_no=sc.nextInt();
        start.mark=sc.nextFloat();
        Node node = new Node(); */
        while(true)
        {
            System.out.println("*MENU**");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert Beginning");
            System.out.println("4: Insert End");
            System.out.println("5: Insert any Position");
            System.out.println("6: Delete Beginning");
            System.out.println("7: Delete End");
            System.out.println("8: Delete any Position");
            System.out.println("9: Search");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                    System.exit(0);
                case 1:
                    end=create(start,end);
                    break;
                case 2:
                    display(start,end);
                    break;
                case 3:
                	start=insBeg(start,end);
                	break;
                case 4:
                	end=insEnd(start,end);
                	break;
                case 5:
                	start=insAny(start,end);
                	break;
                case 6:
                	start=delBeg(start,end);
                	break;
                case 7:
                	end=delEnd(start,end);
                	break;
                case 8:
                	delAny(start,end);
                	break;
                case 9:
                	search(start);
                default:
                    System.out.println("Wrong choice");
            }
        }


    }
    public static Node create(Node start, Node end){
    	Node new_node=new Node();
    	System.out.println("Enter the regd no : ");
    	new_node.regd_no=sc.nextInt();
    	System.out.println("Enter the marks : ");
    	new_node.mark=sc.nextFloat();
		if(start==null){
			start=new_node;
			end=new_node;
		}
		else {
			end.next=new_node;
			new_node.prev=end;
			end=new_node;
		}
    return start;
    }
    public static void display(Node start, Node end){
        Node mover = start;
        System.out.println("The DoubleLinkedList is : ");
        while(mover!=null){
            System.out.println(mover.regd_no+" "+mover.mark);
            mover=mover.next;
        }

    }
    
    
     public static Node insBeg(Node start, Node end){
    	 Node new_node=new Node();
     	System.out.println("Enter the regd no : ");
     	new_node.regd_no=sc.nextInt();
     	System.out.println("Enter the marks : ");
     	new_node.mark=sc.nextFloat();
     	if(start==null){
             start=new_node;
             end=new_node;
         }
         else{
             new_node.next=start;
             start.prev=new_node;
             start=new_node;
            }
         
     return start;
     }
     
     
     public static Node insEnd(Node start, Node end){
    	Node new_node=new Node();
      	System.out.println("Enter the regd no : ");
      	new_node.regd_no=sc.nextInt();
      	System.out.println("Enter the marks : ");
      	new_node.mark=sc.nextFloat();
      	if(start==null){
              start=new_node;
              end=new_node;
          }
          else{
              end.next=new_node;
              new_node.prev=end;
              end=new_node;
          }
      	
        return end;
     }
    public static Node insAny(Node start, Node end){
    	Node new_node=new Node();
      	System.out.println("Enter the regd no : ");
      	new_node.regd_no=sc.nextInt();
      	System.out.println("Enter the marks : ");
      	new_node.mark=sc.nextFloat();
      	System.out.println("Enter the position to insert : ");
      	int n=sc.nextInt();
      	Node mover=start;
      	for(int i=1;i<=n-2;i++){
             mover=mover.next; 
          }
          mover.next.prev=new_node;
          new_node.next=mover.next;
          mover.next=new_node;
          new_node.prev=mover;
          
      	
      	
        return start;
    }
    public static Node delBeg(Node start, Node end){
    	if(start==null) {
    		System.out.println("List is empty");
    		return start;
    	}
    	
    	start=start.next;
    	if(start==null)
    	{
    		end=null;
    	}
    	else {
    	start.prev=null;
    	}
    	
        return start;
    }
    public static Node delEnd(Node start, Node end) {
    	 if (start == null) {
             System.out.println("List is empty.");
             return start;
         }
         if (start.next == null) {
             start = null;
             end = null;
             return start;
         }
    	
    	end=end.prev;
    	end.next=null;
    	return end;
    }
    public static Node delAny(Node start, Node end){
    	System.out.println("Enter the position to delete: ");
    	int n=sc.nextInt();
    	Node mover=start;
    	for(int i=1;i<=n-2;i++)
    		mover=mover.next;
    	mover.next=mover.next.next;
    	mover.next.prev=mover;
    	
        return start;
    }
     public static void search(Node start){
    	 System.out.println("enter the registration number to be found");
    	 int reg=sc.nextInt();
    	 Node mover = start;
    	 int cnt=0;
    	 while(mover!=null){
             cnt++;
             
             if(mover.regd_no==reg){
                 System.out.println(reg+" found at index "+cnt);
                 System.out.println("Enter new marks ");
                 mover.mark=sc.nextFloat();
                 System.out.println("Mark updated successfully ");
                 return;
             }
             mover=mover.next;
         }
    	 System.out.println("Error !! Registration number not found");
     } 
} 
