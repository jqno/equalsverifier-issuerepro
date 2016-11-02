package nl.jqno.equalsverifier;

public abstract class AbstractChild extends AbstractParent {
    private int y;

    public AbstractChild(int x, int y) {
        super(x);
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractChild)) {
            return false;
        }
        AbstractChild other = (AbstractChild)obj;
        return y == other.y;
    }

    @Override
    public int hashCode() {
        return y;
    }
}
