package nl.jqno.equalsverifier;

public abstract class Bakery {

    protected Object flour;

    private Object flour() {
        if (flour == null) {
            synchronized (this) {
                if (flour == null) {
                    flour = createFlour();
                }
            }
        }
        return flour;
    }

    protected abstract Object createFlour();

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Bakery)) return false;
        return flour().equals(((Bakery) obj).flour());
    }

    @Override
    public int hashCode() {
        return flour().hashCode();
    }

}
