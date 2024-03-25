package Map;

import java.util.ArrayList;
import java.util.List;

public class MyMap <K, V> {
    private final List<K> keys;
    private final List<V> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(K key, V value) {
        int index = keys.indexOf(key);
        if (index == -1) {
            keys.add(key);
            values.add(value);
            return;
        }
        values.set(index, value);
    }

    public V get(K key) {
        int index = keys.indexOf(key);
        return index != -1 ? values.get(index) : null;
    }

    public V remove(K key) {
        int index = keys.indexOf(key);
        if (index == -1) {
            return null;
        }
        keys.remove(key);
        return values.remove(index);
    }

    @Override
    public String toString() {
        return "MyMap{" +
                "keys=" + keys +
                ", values=" + values +
                '}';
    }
}
