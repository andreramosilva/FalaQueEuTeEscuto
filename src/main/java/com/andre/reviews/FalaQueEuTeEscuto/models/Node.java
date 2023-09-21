package com.andre.reviews.FalaQueEuTeEscuto.models;

public class Node<T> {
    /* Linked list Node*/
    T data;
    Node<T> next;

    // Constructor to create a new node
    // Next is by default initialized
    // as null
    Node(T d) {
        data = d;
    }
}

