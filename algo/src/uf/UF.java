package uf;

import java.util.HashMap;
import java.util.Map;

public class UF {
    Map<String, String> parent = new HashMap<>();

    public void connect(String p, String q) {
        String key = find(p);
        String value = find(q);

        parent.put(key, value);
    }

    public void reset(String p) {
        parent.put(p, p);
    }

    public String find(String p) {
        if (!parent.containsKey(p)) {
            reset(p);
            return p;
        }

        return parent.get(p) == p ? p : find(parent.get(p));
    }

    public boolean isConnected(String p, String q) {
        return find(p) == find(q);
    }

    public static void main(String[] args) throws Exception {
        UF uf = new UF();

        uf.connect("a", "b");

        uf.connect("b", "c");

        uf.connect("d", "e");

        uf.connect("c", "e");

        System.out.println(uf.isConnected("a", "c"));
        System.out.println(uf.isConnected("a", "e"));
    }
}
