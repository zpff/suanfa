package Hot100;


import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LRUCache {
    class DoubleLinkedNode {
        int key;
        int value;
        DoubleLinkedNode prev;
        DoubleLinkedNode next;
        DoubleLinkedNode(){}
        DoubleLinkedNode(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    HashMap<Integer,DoubleLinkedNode> map = new HashMap<>();
    int size;
    int capacity;
    DoubleLinkedNode head,tail;
    public LRUCache(int capacity) {
        size = 0;
        this.capacity = capacity;
        head = new DoubleLinkedNode();
        tail = new DoubleLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DoubleLinkedNode node = map.get(key);
        if (node == null) return -1;
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DoubleLinkedNode node = map.get(key);
        if(node == null){
            node = new DoubleLinkedNode(key,value);
            map.put(key,node);
            addHead(node);
            size++;
        }
        node.value = value;
        map.put(key,node);
        moveToHead(node);
        if (size > capacity){
            DoubleLinkedNode tail = removeTail();
            map.remove(tail.key);
            size--;
        }
    }
    void addHead(DoubleLinkedNode node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    void removeNode(DoubleLinkedNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    void moveToHead(DoubleLinkedNode node){
        removeNode(node);
        addHead(node);
    }

    DoubleLinkedNode removeTail(){
        DoubleLinkedNode res = tail.prev;
        removeNode(res);
        return res;
    }
}
