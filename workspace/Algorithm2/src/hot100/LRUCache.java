package hot100;

import java.util.HashMap;

class LRUCache {
    class DoubleLinkedNode {
        int key;
        int value;
        DoubleLinkedNode prev;
        DoubleLinkedNode next;
        DoubleLinkedNode (){}
        DoubleLinkedNode(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    HashMap<Integer,DoubleLinkedNode> map = new HashMap<>();
    int size = 0;
    int capcity = 0;
    DoubleLinkedNode head = new DoubleLinkedNode();
    DoubleLinkedNode tail = new DoubleLinkedNode();
    public LRUCache(int capacity) {
        head.next = tail;
        tail.prev = head;
        this.capcity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        DoubleLinkedNode node = map.get(key);
        movetoHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DoubleLinkedNode node;
        if (map.containsKey(key)){
            node = map.get(key);
            node.value = value;
            map.put(key,node);
            movetoHead(node);
        }else {
             node = new DoubleLinkedNode(key,value);
             map.put(key,node);
             addHead(node);
             size++;
        }if (size > capcity){
            DoubleLinkedNode tail = removeTail();
            map.remove(tail.key);
            size--;
        }
    }
    public void addHead(DoubleLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    public void remove (DoubleLinkedNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void movetoHead(DoubleLinkedNode node){
        remove(node);
        addHead(node);
    }

    public DoubleLinkedNode removeTail(){
        DoubleLinkedNode node = tail.prev;
        remove(node);
        return node;
    }
}
