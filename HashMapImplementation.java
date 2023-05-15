public class HashMapImplementation<K, V> {
    private Object[] data;
    public HashMapImplementation(int s) {
        this.data = new Object[s];
    }
    private int hashmap(K k) {
        return k.hashCode() % data.length;
    }
    public static class input<K, V> {
        K k; V v;
        public input(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }
    public void myPut(K k, V v) {
        int i = hashmap(k);
        data[i] = new input<>(k, v);
    }
    public V myGet(K k) {
        int i = hashmap(k);
        input<K, V> e = (input<K, V>) data[i];
        if (e != null && e.k.equals(k)) {
            return e.v;
        }
        return null;


    }




    public static void main(String[] args) {
        HashMapImplementation<Integer,String> myHashMap= new HashMapImplementation<>(20);
        myHashMap.myPut(10,"Tareq");
        myHashMap.myPut(11," jamil");
        myHashMap.myPut(44," abdul-jabbar");
        System.out.print(myHashMap.myGet(10));
        System.out.print(myHashMap.myGet(11));
        System.out.print(myHashMap.myGet(44));


    }
}
