
class Q5_GenericPrintArrayMethod {
    public static < E > void printArray( E[] inputArray){
        System.out.println("\nThe array elements are : ");
        for (E x:inputArray)
            System.out.print(x+" ");
    }
    public static void main(String[] args) {
        Integer arr[]={24,56,78,65};
        //Type of E can be wrapper classes only .. class 'Integer' but not primitive 'int'
        String str[]={"Abc","pqr","xyz"};
        Double db[]={34.6,73.5,12.22,89.4,74.1};
        Object obj[]={47,"Amaresh",75.03};
        printArray(arr);
        printArray(str);
        printArray(db);
        printArray(obj);
    }
}

/* :::::: OUTPUT :::::::
  
The array elements are : 
24 56 78 65 
The array elements are : 
Abc pqr xyz 
The array elements are : 
34.6 73.5 12.22 89.4 74.1 
The array elements are : 
47 Amaresh 75.03 

*/
