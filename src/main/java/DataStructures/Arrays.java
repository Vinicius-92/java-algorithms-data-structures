package DataStructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<Character> array = new ArrayList<Character>();
        Collections.addAll(array, 'a', 'b', 'c', 'd');
        // ['a', 'b', 'c', 'd']
        // Push or add O(1) but can be O(n) for dynamic arrays such as ArrayList
        array.add('e');
        // ['a', 'b', 'c', 'd', 'e']
        // Pop or remove O(1)
        array.remove(array.size() -1);
        // ['a', 'b', 'c', 'd']
        // Add at index O(n)
        array.add(0, 'x');
        // ['x', 'a', 'b', 'c', 'd']
        // Add at index O(n)
        array.remove(0);
        // ['a', 'b', 'c', 'd']
    }
}

class MyArray {
    int length;
    Object[] data;

    public MyArray(int length) {
        this.length = length;
        this.data = new Object[length];
    }

    Object lookUp(int index) {
        return data[index];
    }

    void push(Object obj) {
        data[length] = obj;
        length++;
    }

    void remove(Object obj) {
        for (int i = 0; i < length; i++) {
            if (data[i] == obj) {
                data[i] = null;
                length--;
            }
        }
    }


}