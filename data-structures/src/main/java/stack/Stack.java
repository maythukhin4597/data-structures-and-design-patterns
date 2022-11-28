package stack;

import java.util.Collection;
import java.util.function.Predicate;
//https://www.programiz.com/
//prefer Dequeue interface , stack is for legacy
//Complexity O(1)
public interface Stack<Object> {

    boolean empty();

    Object peek();

    Object pop();

    void push(Object o);

    //   search get its distance from the top:
    int search(Object o);

    int indexOf(Object o);

    // find the index of the element that's closest to the top of the stack
    int lastIndexOf(Object o);

    boolean remove(Object object);

    boolean removeElement(Object object);

    void removeElementAt(int index);

    Object remove(int index);

    boolean removeAll(Collection c);

    boolean removeIf(Predicate p);
}

//applications
//reverse word
//calculate expression (prefix, postfix)
//browser back function