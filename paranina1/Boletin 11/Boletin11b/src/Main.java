public class Main {
    public static void main(String[] args) {
        long i=0,s=0,m=1;
        for (i=10;i<=90;i++) {
            s=s+i;
            m=Math.round(m*i);
        }
        System.out.println("\n suma:"+s+"\n produto:"+m);
    }
}