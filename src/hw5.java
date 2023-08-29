public class hw5 {
    public static void main(String[] args) {
        int A=15, B=100;
        if (A>=100 && B<=50) {
            System.out.println(1);
        }
      else
        System.out.println(0);

        int C=90, D=40;
        if (C>=100&&D<=50)
        {
            System.out.println(1);
        }
        else if (D>=100 && C<=50){
            System.out.println(1);
        }
        else
        System.out.println(0);
    }
}
