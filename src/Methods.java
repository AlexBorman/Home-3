public class Methods {
    private static int a;
    private static int b;

    public Methods(int a1, int b1) {
        a=a1;
        b=b1;
    }

    public static int dodatu() throws MyException {
        Methods.Check();
        return a + b;
    }
    public static int vidnatu() throws MyException {
        Methods.Check();
        return a - b;
    }
    public static int mnojtu() throws MyException {
        Methods.Check();
        return a * b;
    }
    public static int dilutu() throws MyException {
        Methods.Check();
        return a / b;
    }

    private static void Check() throws MyException {
        if ((a < 0) && (b < 0)) {
            throw new IllegalArgumentException("a<0 і b<0");
        }
        if (((a == 0) && (b != 0)) || ((a != 0) && (b == 0))) {
            throw new ArithmeticException("a=0 і b!=0 або a!=0 і b=0");
        }
        if ((a == 0) && (b == 0)) {
            throw new IllegalArgumentException("a=0 і b=0 ");
        }
        if ((a > 0) && (b > 0)) {
            throw new MyException("a>0 і b>0 ");
        }
    }
}