public class Test4 {
    public static long[] aa(int N) {
        long[] a = new long[N];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < N ;
        i++){
            a[1] = a[i - 1] + a[i - 2];
        }
        return a;
    }
    public static void main(String[] args){
        long[] b=aa(100);
        for (int i=0;i<100;i++){
            System.out.println(i+":"+b[i]);
        }
    }
}
