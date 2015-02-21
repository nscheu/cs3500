package kvmap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
/**
 * EmptyMap Class - subclass of Alist ADT
 * @param <K> - the Key Type
 * @param <V> - the Value Type
 * @author Nicholas Scheuring - scheuring.n@husky.neu.edu - u/n nscheu
 * @version May 14, 2014
 */
public class EmptyMap<K, V> extends Alist<K, V> {
    /**
     * 
     * Default Constructor for EmptyMap
     */
    public EmptyMap() {
        //empty Constructor
    }
    /**
     * Assign method assigns a key to a value and adds to map
     * @param k - the Key
     * @param v - the Value
     * @return the new Alist
     */
    @Override
    public Alist<K, V> assign(K k, V v) {
        return new Assign<K, V>(k, v, this);
    }
    /**
     * Is the Map empty?
     * @return true
     */
    @Override
    public boolean isEmpty() {
        return true;
    }
    /**
     * What is the size of the Map?
     * @return 0
     */
    @Override
    public int size() {
        return 0;
    }
    /**
     * Does the Map contain the Key?
     * @param k - the Key
     * @return true if contains, false if not contains
     */
    @Override
    public boolean containsKey(K k) {
        return false;
    }
    /**
     * Does the Map contain the Value?
     * @param v - the value
     * @return true if contains, false if not contains
     */
    @Override
    public boolean containsValue(V v) {
        return false;
    }
    /**
     * Get the value of the key
     * @param k - the key
     * @return the value
     */
    @Override
    public V get(K k) {
        throw new RuntimeException("EmptyMap :: .get(k) :: illegal access::");
    }
    /**
     * toString represents the map as a string
     * @return the string
     */
    @Override
    public String toString() {
        return "{...[There are " + this.size() + " unique key(s) mapped to "
                + "value(s) in this KVMap]...}";
    }
    /**
     * Compares an object to a Alist for equality
     * @param o - the object
     * @return true if equal, false if not equal
     */
    @Override
    public boolean equals(Object o) {
        return ((o instanceof EmptyMap) || (o instanceof EmptyNode));
    }
    /**
     * Generates a hashCode for a Alist
     * @return the hashCode 0 for empty
     */
    @Override
    public int hashCode() {
        return 0;
    }
    /**
     * Iterator method for Alist
     * @return the Iterator
     */
    @Override
    public Iterator<K> iterator() {
        return new MapIterator<K>(this.getKeys());
    }
    /**
     * Iterator method for Alist with Comparator
     * @param c - the comparator
     * @return the Iterator
     */
    @Override
    public Iterator<K> iterator(Comparator<? super K> c) {
        return new MapIterator<K>(this.getKeys(), c);
    }
    /**
     * Adds all map keys to an ArrayList
     * @return al - the arraylist
     */
    @Override
    ArrayList<K> getKeys() {
        return new ArrayList<K>();
    }
    /**
     * Adds map keys to an arraylist
     * @param al - the arraylist to add keys to
     * @return the arraylist with all the keys
     */
    ArrayList<K> addKeys(ArrayList<K> al) {
        return al;
    }
    /**
     * Gets hashes for BST
     * @param hs - the hashSet
     * @return hs - the hashset
     */
    @Override
    HashSet<K> getHash(HashSet<K> hs) {
        return hs;
    }
    /**
     * accept method for Visitor pattern
     * @param v - the visitor
     * @return a KVMap
     */
    @Override
    public KVMap<K, V> accept(KVMapVisitor<K, V> v) {
        return this;
    }
    
}