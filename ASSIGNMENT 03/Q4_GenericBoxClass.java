class Box<T>{
    T n;
    Box(T n){
        this.n = n;
    }
    T getData(){
        return n;
    }
    void setData(T n){
        this.n = n;
    }
}

public class Q4_GenericBoxClass {
    public static void main(String[] args) {

        System.out.println("::::::::::Experiment on Boxed String Object:::::::::::::\n");

        Box<String> s=new Box<>("Disha");
        Box<String> s1=s;
        Box<String> s2=s;

        System.out.println("Initial value of s1 " + s1.getData());
        System.out.println("Initial value of s2 " + s2.getData());


        s1.setData("Disha Tripathy");
        //As both s1 and s2 refer to same object ...
        // changing the content of one will reflect the change is other too

        System.out.println("Final value of s1 " + s1.getData());
        System.out.println("Final value of s2 " + s2.getData());

        System.out.println("\n\n::::::::::Experiment on Boxed Integer Object:::::::::::::\n");
        Box<Integer> n=new Box<>(47);
        Box<Integer> n1=n;
        Box<Integer> n2=n;

        System.out.println("Initial value of n1 " + n1.getData());
        System.out.println("Initial value of n2 " + n2.getData());


        n2.setData(66);

        System.out.println("Final value of n1 " + n1.getData());
        System.out.println("Final value of n2 " + n2.getData());

        System.out.println("\n\n::::::::::Experiment on Boxed Object object:::::::::::::\n");
        Box<Object> obj=new Box<>("Amaresh");
        Box<Object> obj1=obj;
        Box<Object> obj2=obj;

        System.out.println("Initial value of obj1 " + obj1.getData());
        System.out.println("Initial value of obj2 " + obj2.getData());


        obj1.setData(75.03);

        System.out.println("Final value of obj1 " +obj1.getData());
        System.out.println("Final value of obj2 " + obj2.getData());



    }
}

/* ::::::::::::::::::   OUTPUT  :::::::::::::::::::

  :::::::::Experiment on Boxed String Object:::::::::::::

Initial value of s1 Disha
Initial value of s2 Disha
Final value of s1 Disha Tripathy
Final value of s2 Disha Tripathy


::::::::::Experiment on Boxed Integer Object:::::::::::::

Initial value of n1 47
Initial value of n2 47
Final value of n1 66
Final value of n2 66


::::::::::Experiment on Boxed Object object:::::::::::::

Initial value of obj1 Amaresh
Initial value of obj2 Amaresh
Final value of obj1 75.03
Final value of obj2 75.03

Process finished with exit code 0

 */
