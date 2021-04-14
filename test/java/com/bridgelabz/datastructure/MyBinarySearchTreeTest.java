package com.bridgelabz.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyBinarySearchTreeTest
{
    @Test
    public void given3Numbers_WhenAddedToBinaryTree_ShouldReturnSizeThree()
    {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(3, size);
    }
}
