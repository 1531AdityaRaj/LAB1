public class palindrom {
    public static void main(String[]args) {
        int n = 121,n1=n,d=0,s=0;
        while(n>0)
        {
            s=s*10+(n%10);
            n=n/10;
        }
        if(s==n1)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }
}
