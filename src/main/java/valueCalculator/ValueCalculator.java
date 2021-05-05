package valueCalculator;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.function.Function;

public class ValueCalculator<K, V> {

    private Map<K, V> cash;

    public ValueCalculator() {
        this.cash = new ConcurrentHashMap<>();
    }

    public Future<V> compute(final K k, Function<K, V> f) {
        return CompletableFuture.supplyAsync(() -> cash.computeIfAbsent(k, f));
    }
}

