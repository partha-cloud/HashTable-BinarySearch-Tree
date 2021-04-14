
package com.bridgelabz.datastructure;

public class MyBinaryNode<K extends Comparable<K>>
{
    public K key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;

    public MyBinaryNode(K key)
    {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}