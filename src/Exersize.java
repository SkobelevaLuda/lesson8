import java.util.Objects;

public class Exersize {
    private final int a;
    private final int b;

    public Exersize(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exersize)) return false;
        Exersize exersize = (Exersize) o;
        return a == exersize.a && b == exersize.b||a == exersize.b && b == exersize.a;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(a)+Objects.hashCode(b);
    }

    @Override
    public String toString() {
        return a+"*"+b+"="+(a*b);
    }
}
