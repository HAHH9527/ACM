package myStack;

public class MyStack<E> {
    private int size;
    private A<E> top;

    public MyStack() {
	size = 0;
    }

    public void push(E obj) {
	A<E> temp = new A<E>(obj);
	if (this.size == -1) {
	    top = temp;
	} else {
	    temp.setHead(top);
	    top = temp;
	}
	size++;
    }

    public E peek() {
	return top.getValue();
    }

    public E pop() {
	A<E> temp = top;
	top = top.getHead();
	size--;
	return temp.getValue();
    }

    public int search(E obj) {
	A<E> temp = top;
	int count = size - 1;
	while (obj != temp.getValue()) {
	    temp = temp.getHead();
	    count--;
	    if (count == -1) {
		break;
	    }
	}
	return count;
    }

    public boolean empty() {
	if (size == 0) {
	    return true;
	} else {
	    return false;
	}
    }

}
