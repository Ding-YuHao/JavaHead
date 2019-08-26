public class Test {
    public void printTest() {
        System.out.println("Test");
    }

    public void printGiven(int src) {
        System.out.println(src);
    }

    public int origin(int a) {
        return a;
    }

    public String red(String src) {
        return src;
    }


    public static void main(String[] args) {
        Test test = new Test();
        test.printTest();
        test.printGiven(10086);

        int testA = test.origin(10010);
        System.out.println(testA);
        String testB = test.red("test");
        System.out.println(testB);
    }
}