public class hw7 {
    public static void main(String[] args) {
        int n=5;
        while((n*n*n+91)%47==0)
            if (n>=0)
                n=n-1;
            else
                n=n;
        System.out.println(n);




    }
}
