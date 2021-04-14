package com.bridgelabz.datastructure;

public interface INode<K>
{
    K getKey();

    void setKey(K key);

    INode getNext();

    void setNext(INode<K> next);
}