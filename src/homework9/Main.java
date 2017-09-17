package homework9;

/**
 * Created by Илья on 30.08.2017.
 */
public class Main {


    public static void main(String[] args) {
        MyLinkedListExample();
        MyArrayListExample();
        MyQueueExample();
        MyStackExample();
        MyHashMapExample();
    }
    public static void MyLinkedListExample(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        System.out.println("-------------MyLinkedList-------------");
        System.out.println("Додаємо елементи в MyLimkedList");
        myLinkedList.add(2);
        myLinkedList.add(7);
        myLinkedList.add(10);
        myLinkedList.add(4);
        myLinkedList.add(100);
        System.out.println("Виводимо всі елементи списку");
        myLinkedList.show();
        System.out.println("Поточний розмір колнкції - " + myLinkedList.size());
        System.out.println("Видаляємо пеший елемент зі списку");
        myLinkedList.remove(0);
        System.out.println("Видаляємо останній елемент зі списку");
        myLinkedList.remove(myLinkedList.size()-1);
        System.out.println("Виводимо всі елементи зі списку");
        myLinkedList.show();
        System.out.println("Повертаємо останній елемент зі списку");
        System.out.println("" + myLinkedList.get(myLinkedList.size()-1));
        System.out.println("Очищуємо коллекцію");
        myLinkedList.clear();
    }
    public static void MyArrayListExample(){
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        System.out.println("-------------MyArrayList-------------");
        System.out.println("Додаємо елементи в MyArrayList.........");
        myArrayList.add(2);
        myArrayList.add(7);
        myArrayList.add(10);
        myArrayList.add(4);
        myArrayList.add(100);
        System.out.println("Виводимо елементи з листа.........");
        myArrayList.printCollection();
        System.out.println("Поточний розмір колнкції - " + myArrayList.size());
        System.out.println("Видаляємо пеший елемент з листа.........");
        myArrayList.remove(0);
        System.out.println("Видаляємо останній елемент з листа.........");
        myArrayList.remove(myArrayList.size()-1);
        System.out.println("Виводимо всі елементи ласта.........");
        myArrayList.printCollection();
        System.out.println("Повертаємо останній елемент з листа.......");
        System.out.println("" + myArrayList.get(myArrayList.size()-1));
        System.out.println("Очищуємо коллекцію...");
        myArrayList.clear();
    }
    public static void MyQueueExample(){
        MyQueue<Integer> myQueue = new MyQueue<>();
        System.out.println("-------------MyQueue-------------");
        System.out.println("Додаємо елементи в MyQueue");
        myQueue.add(2);
        myQueue.add(7);
        myQueue.add(10);
        myQueue.add(4);
        myQueue.add(100);
        System.out.println("Виводимо елементи черги");
        myQueue.show();
        System.out.println("Поточний розмір колнкції - " + myQueue.size());
        System.out.println("Видаляємо пеший елемент черги");
        myQueue.remove(0);
        System.out.println("Видаляємо останній елемент черги");
        myQueue.remove(myQueue.size()-1);
        System.out.println("Виводимо елементи черги");
        myQueue.show();
        System.out.println("Повертаємо перший елемент черги");
        System.out.println("" + myQueue.peek());
        System.out.println("Повертаємо перший елемент черги та видаляємо його");
        System.out.println("" + myQueue.poll());
        System.out.println("Очищуємо коллекцію");
        myQueue.clear();
    }
    public static void MyStackExample(){
        MyStack<Integer> myStack = new MyStack<>();
        System.out.println("-------------MyStack-------------");
        System.out.println("Додаємо елементи в MyStack");
        myStack.push(2);
        myStack.push(7);
        myStack.push(10);
        myStack.push(4);
        myStack.push(100);
        System.out.println("Виводимо елементи стеку");
        myStack.show();
        System.out.println("Поточний розмір колнкції - " + myStack.size());
        System.out.println("Видаляємо пеший елемент стеку");
        myStack.remove(0);
        System.out.println("Видаляємо останній елемент стеку");
        myStack.remove(myStack.size()-1);
        System.out.println("Виводимо елементи стеку");
        myStack.show();
        System.out.println("Повертаємо перший елемент стеку");
        System.out.println("" + myStack.peek());
        System.out.println("Повертаємо перший елемент черги та видаляємо його");
        System.out.println("" + myStack.pop());
        System.out.println("Очищуємо коллекцію");
        myStack.clear();
    }
    public static void MyHashMapExample(){
        MyHashMap<String, Integer> hashMap = new MyHashMap<>();
        System.out.println("-------------homework9.MyHashMap-------------");
        System.out.println("Додаємо елементи в homework9.MyHashMap");
        hashMap.put("vasya", 3);
        hashMap.put("vasya", 4);
        hashMap.put("nik", 6);
        hashMap.put("vasya", 6);
        hashMap.put("petro", 20);
        hashMap.put("oleksiy", 3);
        System.out.println("Виводимо елементи homework9.MyHashMap");
        hashMap.show();
        System.out.println("Поточний розмір колнкції - " + hashMap.size());
        System.out.println("Видаляємо елемент homework9.MyHashMap по ключу /vasya/");
        hashMap.remove("vasya");
        System.out.println("Виводимо елементи homework9.MyHashMap");
        hashMap.show();
        System.out.println("Повертаємо значення по ключу nik - " + hashMap.get("nik"));
        System.out.println("Очищуємо коллекцію");
        hashMap.clear();
    }
}
