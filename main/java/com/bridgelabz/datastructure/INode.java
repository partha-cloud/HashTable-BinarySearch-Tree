package com.bridgelabz.datastructure;

public class INode<K>

{
    K getKey();

    void setKey(K key);

    INode getNext();

    void setNext(INode<K> next);
}