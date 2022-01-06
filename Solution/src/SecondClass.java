public class SecondClass extends FirstClass {
    SecondClass(int a, int b, int c) {
        super(a);
        this.b = b;
        this.c = c;
    }
    @Override
    public int plus(int d) {
        return plus(d) + a;
    }
}
