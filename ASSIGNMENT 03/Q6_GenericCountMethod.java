
class Q6_GenericCountMethod {
    public static <T> int count(T[] array, T item)
    {
        int c=0;
        for(T x:array)
            if(x==item) c++;
        return c;
    }

    public static void main(String[] args) {
        Integer arr[]={24,56,78,65,24,11,78,24,15,31,24};
        System.out.println("Occurrence of 24 is "+count(arr,24)+" times");

        String str[]={"ab","bc","ab","sd"};
        System.out.println("Occurrence of \"ab\" is "+count(str,"ab")+" times");

    }
}

/*  :::::OUTPUT:::::

Occurrence of 24 is 4 times
Occurrence of "ab" is 2 times

*/
