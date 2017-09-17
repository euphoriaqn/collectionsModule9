package homework9;

public class MyLinkedList<T> {
    Node<T> first;
    Node<T> last;
    private int size = 0;

    public MyLinkedList(T[] items) {
        first = new Node<T>(items[0], null, null);
        last = first;

        for(int i = 1; i < items.length; i++){
            add(items[i]);
        }
    }
    public MyLinkedList(){

    }

    public void add(T item){

            Node<T> l = last;
            Node<T> newNode = new Node<>(item, null, l);
            last = newNode;
            if (l == null)
                first = newNode;
            else
                l.next = newNode;
            size++;
     //       modCount++;
    }


    public void show() {
        Node<T> iterator = first;
        if (iterator == null) return;

        do {
            System.out.print("" + iterator.item + " ");
            iterator = iterator.next;
        } while (iterator != null);
        System.out.println();
    }
    public int size(){
        return size;
    }
    public T get(int index) {
        Node<T> iterator = first;
        if (iterator == null) throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        do {
            iterator = iterator.next;
        } while (iterator.next != null);
        return (T)iterator.item;
    }
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }
    public void clear(){
        first = null;
        last = null;
        size = 0;
    }
    public void remove(int index){
        Node<T> iterator = first;
        Node<T> buffer;
        if (iterator == null) return;
        for (int i = 0; i <index; i ++)
            iterator = iterator.next;
        if (iterator.next !=null && iterator.prev !=null) {
            iterator.next.prev = iterator.prev;
            iterator.prev.next = iterator.next;
            size -= 1;
        }
        else if(iterator.next == null && iterator.prev == null){
            first = null;
            last = null;
            size  -= 1;
        }
        else if (iterator.next == null){
            iterator.prev.next = null;
            last = iterator.prev;
            size -=1;
        }
        else if (iterator.prev == null){
            iterator.next.prev = null;
            first = iterator.next;
            size -=1;
        }
    }
}
