package org.stack;

public class Stack {
    private int[] array;
    private int ind;
    public Stack(int length){
        array = new int[length];
        ind = length - 1;
    }

    public int push(int data){
        array[ind] = data;
        ind--;
        return 0;
    }

    public int pop(){
        ind++;
        return array[ind];
    }

    public boolean isEmpty(){
        if (ind == array.length){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if (ind == -1){
            return true;
        }
        return false;
    }
}
