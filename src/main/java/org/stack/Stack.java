package org.stack;

public class Stack {
    private int[] array;
    private int ind = 0;
    public Stack(int length){
        array = new int[length];
    }

    public int push(int data){
        if (ind == array.length){
            return -1;
        }
        array[ind] = data;
        ind++;
        return 0;
    }

    public int pop(){
        if (ind == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        ind--;
        return array[ind];
    }
}
