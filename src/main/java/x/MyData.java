package x;

import lombok.Value;
import lombok.NonNull;

@Value
public final class MyData {
    @NonNull
    private final String something;

    public MyData(String s) {
        this.something = s;
    }
}
