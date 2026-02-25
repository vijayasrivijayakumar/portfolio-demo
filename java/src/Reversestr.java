public class Reversestr {
    public static void main(String[]args)
    {
    char a[]={'h','e','l','l','o'};
    char temp ;
    int start=0;
    int end = a.length-1;
    while(start<end)
    {
        temp=a[start];
        a[start]=a[end];
        a[end]=temp;
        
        start++;
        end--;
    }
    
System.out.println("Reversestr:" + new String(a));
    }
}

    

    
    

