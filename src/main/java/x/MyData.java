package x;

import java.util.Objects;

import lombok.NonNull;
import lombok.Value;

@Value
public final class MyData {
    @NonNull
    private final String something;

    public MyData(String s) {
        this.something = s;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyData)) {
            return false;
        }
        MyData other = (MyData)obj;
        return Objects.equals(something, other.something);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(something);
    }
}
