package Task09;

import java.util.Objects;

public class MyHashMap <K,V>{

    private int COMPASITY = 16;
    Node<K,V>[] array = (Node<K,V>[]) new Node[COMPASITY];
    private int size = 0;

    public void put(K key, V value){
        Node<K,V> list = new Node<>(hashCode(key),key,value);
        int index = list.getHash() % array.length;

        if(index < 0){
            index *= -1;
        }
        if(array[index] == null){
            array[index] = list;
            size++;
            return;
        }if(array[index].equals(list)){
            array[index].value = value;
        }else{
            Node<K,V> temp = array[index].next;
            while(temp.next != null){
                if(temp.key == key){
                    temp.value = value;
                    return;
                }
                temp = temp.next;
            }if(temp.next == null){
                temp.next = list;
                size++;
            }
        }
    }


    public void clear(){
        array = (Node<K, V>[]) new Node[COMPASITY];
        size = 0;
    }
    public int size(){
        return size;
    }
    public void remove(K key){
        for(int i = 0; i < array.length; i++){
            if(array[i] != null && array[i].key == key){
                if(array[i].next != null){
                    array[i] = array[i].next;
                }else{
                    array[i] = null;}
            }
            Node<K,V> temp = array[i];
            while(temp != null && temp.next != null){
                if(temp.next.key == key){
                    temp.next = temp.next.next;
                }
                temp = temp.next;
            }
        }
        size--;
    }
    private int hashCode(Object key){
        return key.hashCode();
    }
    public V get(K key) {
        for(int i = 0; i < array.length; i++){
            if(array[i] != null && array[i].key == key){
                return array[i].value;
            }
            Node<K,V> temp = array[i];
            while(temp != null && temp.next != null){
                if(temp.next.key == key){
                    temp = temp.next;
                    return temp.value;
                }
                temp = temp.next;
            }
        }
        throw new NullPointerException("No such Key");
    }
}
class Node <K,V>{
    private int hashPozition;
    K key;
    V value;
    Node<K,V> next;

    public Node(int hash,K key, V value){
        this.hashPozition = hash;
        this.key = key;
        this.value = value;
        this.next = null;
    }
    public int getHash(){
        return hashPozition;
    }
    @Override
    public boolean equals(Object o){
        if (this == o){return true;}

        if(o == null || o.getClass() != getClass()) {return false;}
        Node<K,V> node = (Node<K, V>) o;
        return Objects.equals(key, node.key);
    }
    @Override
    public int hashCode(){
        return Objects.hash(key);
    }
}
