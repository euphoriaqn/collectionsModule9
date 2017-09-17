package homework9;

/**
 * Created by Илья on 11.09.2017.
 */
public class MyStack<T> {
    Node<T> first;
    Node<T> last;
    private int size = 0;
    public MyStack(T[] items) {
        first = new Node<T>(items[0], null, null);
        last = first;

        for(int i = 1; i < items.length; i++){
            push(items[i]);
        }
    }
    public MyStack(){
    }

    public void push(T item){

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
    public int size(){
        return size;
    }
    public void clear(){
        first = null;
        last = null;
        size = 0;
    }
    public T peek(){
        return (last == null) ? null : last.item;
    }
    public T pop(){
        T ret;
        ret = peek();
        if (ret!= null){
            if (last.prev!=null){
                last.prev.next = null;
                last = last.prev;
            }
            else {first = null;
                last = null;
            }
        }
        return ret;
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
            size  -= 1;
        }
        else if (iterator.prev == null){
            iterator.next.prev = null;
            first = iterator.next;
            size  -= 1;
        }
    }
}
