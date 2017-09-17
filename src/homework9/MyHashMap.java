package homework9;

/**
 * Created by Илья on 10.09.2017.
 */
public class MyHashMap<K, V> {
    private Node<K, V> simpleConnectedNode;
    private int size = 0;

    public void put(K key, V value) {
        if (simpleConnectedNode == null) {
            simpleConnectedNode = new Node<>(key, value, null);
            size++;
        } else {
            int count = 0;
            Node<K, V> iterator = simpleConnectedNode;
            do {
                if (iterator.key.equals(key)){
                    iterator.value = value;
                    return;
                }
                iterator = iterator.prev;
                count++;

            } while (size != count);
            Node<K, V> node = new Node<>(key, value, simpleConnectedNode);
            simpleConnectedNode = node;
            size++;
        }
    }

    public void remove(K key) {
        int count = 0;
        Node<K, V> iterator = simpleConnectedNode;
        Node<K, V> bufferedIterator = simpleConnectedNode;
        do {
            if (iterator.key.equals(key) && iterator.prev == null) {
                bufferedIterator.prev = null;
                size--;
                break;
            }
            else if (iterator.key.equals(key)){
                iterator.key = iterator.prev.key;
                iterator.value = iterator.prev.value;
                iterator.prev = iterator.prev.prev;
                size--;
                break;
            }
            bufferedIterator = iterator;
            iterator = iterator.prev;
            count++;

        } while (size != count);
    }

    public void clear() {
        for (Node<K, V> x = simpleConnectedNode; x != null; ) {
            Node<K, V> next = x.prev;
            x.key = null;
            x.value = null;
            x = next;
        }
        simpleConnectedNode = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        Node<K, V> valueNode = simpleConnectedNode;
        if (valueNode.key.equals(key)) return valueNode.value;
        else {
            do {
                valueNode = valueNode.prev;
            } while (!valueNode.key.equals(key));
            return valueNode.value;
        }
    }

    public void show() {
        Node<K, V> currentNode = simpleConnectedNode;
        if (currentNode == null) {
            System.out.println("ноди отсутствуют");
            return;
        }
        do {
            System.out.println(currentNode.key + ", " + currentNode.value);
            currentNode = currentNode.prev;
        } while (currentNode != null);
    }

    private class Node<K, V> {
        K key;
        V value;
        Node<K, V> prev;

        public Node(K key, V value, Node<K, V> prev) {
            this.value = value;
            this.key = key;
            this.prev = prev;
        }
    }

}