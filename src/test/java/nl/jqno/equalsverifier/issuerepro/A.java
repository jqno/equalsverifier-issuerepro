package nl.jqno.equalsverifier.issuerepro;

public class A {
    private B b;

    @Override
    public int hashCode() {
        return 31 + ((b == null) ? 0 : b.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        return java.util.Objects.equals(b, ((A) obj).b);
    }
}
