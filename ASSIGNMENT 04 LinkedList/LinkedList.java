import java.util.Scanner;

class Node{
    protected int regd_no;
    protected float mark;
    protected Node next;

}
///////////////////////////////////////////////////////////////////////////////////
class LinkedList {

    public static void main(String[] args) {
        Node head = null;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("****MENU*****");
            System.out.println("0:Exit");
            System.out.println("1:Creation");
            System.out.println("2:Display");
            System.out.println("3:Insert at beginning");
            System.out.println("4:Insert at end");
            System.out.println("5:Insert at any position");
            System.out.println("6:Delete from beginning");
            System.out.println("7:Delete from end");
            System.out.println("8:Delete from any position");
            System.out.println("9:Delete by regd_no");
            System.out.println("10:Search");
            System.out.println("11:count");
            System.out.println("12:Reverse");

            System.out.println("Enter the choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    head = create(head);
                    break;
                case 2:
                    display(head);
                    break;
                case 3:
                    head = InsBeg(head);
                    break;
                case 4:
                    head = InsEnd(head);
                    break;
                case 5:
                    head = InsAny(head);
                    break;
                case 6:
                    head = DelBeg(head);
                    break;
                case 7:
                    head = DelEnd(head);
                    break;
                case 8:
                    head = DelAny(head);
                    break;
                case 9:
                    head = DelByRegdNo(head);
                    break;
                case 10:
                    search(head);
                    break;
                case 11:
                    System.out.println("Number of nodes in the linkedlist is " + count(head));
                    break;
                case 12:
                    head = reverse(head);
                    break;
                default:
                    System.out.println("Wrong choice");

            }
        }

    }

    ///////////////////////////////////////////////////////////////////////////////////
    public static Node create(Node start) {

        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            Node node = new Node();
            System.out.println("Enter the regd_no and mark");
            node.regd_no = sc.nextInt();
            node.mark = sc.nextFloat();

            if (start == null) {
                start = node;
            } else {
                Node temp = start;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
            }
            System.out.println("Would you like to enter another node(y/n)");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        return start;
    }

    ///////////////////////////////////////////////////////////////////////////////////
    public static void display(Node start) {
        Node temp = start;
        System.out.println("Regd_No \t Mark");
        while (temp != null) {
            System.out.println(temp.regd_no + "\t" + temp.mark);
            temp = temp.next;
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////
    public static Node InsBeg(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the regd_no and mark");
        Node new_node = new Node();
        new_node.regd_no = sc.nextInt();
        new_node.mark = sc.nextFloat();
        new_node.next = start;
        start = new_node;
        return start;
    }

    ///////////////////////////////////////////////////////////////////////////////////
    public static Node InsEnd(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the regd_no and mark");
        Node new_node = new Node();
        new_node.regd_no = sc.nextInt();
        new_node.mark = sc.nextFloat();
        Node temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
        return start;
    }

    ///////////////////////////////////////////////////////////////////////////////////
    public static Node InsAny(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the regd_no and mark");
        Node new_node = new Node();
        new_node.regd_no = sc.nextInt();
        new_node.mark = sc.nextFloat();
        Node temp = start;
        System.out.println("Enter the position to insert the node");
        int pos = sc.nextInt();
        for (int i = 1; i <= pos - 2; i++)
            temp = temp.next;
        new_node.next = temp.next;
        temp.next = new_node;
        return start;
    }

    ///////////////////////////////////////////////////////////////////////////////////
    public static Node DelBeg(Node start) {
        // Node temp=start;
        start = start.next;
        // temp.next=null;
        return start;
    }
    ///////////////////////////////////////////////////////////////////////////////////

    public static Node DelAny(Node start) {
        Scanner sc = new Scanner(System.in);
        Node temp = start;
        System.out.println("Enter the position to delete the node : ");
        int pos = sc.nextInt();
        for (int i = 1; i <= pos - 2; i++)
            temp = temp.next;

        temp.next = temp.next.next;

        return start;
    }

    ///////////////////////////////////////////////////////////////////////////////////
    public static Node DelEnd(Node start) {
        if (start.next == null || start == null) return null;
        Node temp = start;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return start;
    }
    ///////////////////////////////////////////////////////////////////////////////////

    public static Node DelByRegdNo(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter regd_no of Node to delete : ");
        int reg = sc.nextInt();

        Node temp = start;
        Node prev = null;
        while (temp != null) {
            if (temp.regd_no == reg) {
                prev.next = temp.next;
                break;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        return start;
    }
    ///////////////////////////////////////////////////////////////////////////////////

    public static void search(Node start) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter regd_no to search : ");
        int reg = sc.nextInt();
        int c = 1;
        Node temp = start;
        while (temp != null) {
            if (temp.regd_no == reg) {
                System.out.println(reg + " found at node " + c);
                return;
            }
            temp = temp.next;
            c++;
        }
        System.out.println(reg + " not found");
    }
    ///////////////////////////////////////////////////////////////////////////////////

    public static Node reverse(Node start){
        Node mover=start;
        Node prev=null;
        while(mover != null){
            Node next=mover.next;
            mover.next=prev;
            prev=mover;
            mover=next;
        }
        start=prev;
        return start;
    }

    //////////////////////////////////////////////////////////////////////////////////

    public static int count(Node start){
        int c=0;
        Node temp=start;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
 }//class
