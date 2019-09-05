public class Test3 {
    public static double logg(int N) {
        if (N>1)
            return Math.log(N)+logg(N-1);
        else
            return 0;
    }
    public static void main(String[] args) {
        System.out.println(logg(3));
    }
}
