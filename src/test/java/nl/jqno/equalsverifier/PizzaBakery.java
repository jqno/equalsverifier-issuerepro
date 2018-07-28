package nl.jqno.equalsverifier;

import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

public class PizzaBakery extends Bakery {

    private final Supplier<Object> flourFactory;

    protected PizzaBakery(final Supplier<Object> flourFactory) {
        this.flourFactory = requireNonNull(flourFactory);
    }

    @Override
    protected Object createFlour() {
        return flourFactory.get();
    }

    public static Bakery newBakery() {
        return new PizzaBakery(Object::new);
    }

}
