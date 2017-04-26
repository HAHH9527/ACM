package myStack;

public class A<E> {
    private A head;
    private E value;

    public A(E obj) {
	this.setValue(obj);
    }

    public A getHead() {
	return head;
    }

    public void setHead(A head) {
	this.head = head;
    }

    public E getValue() {
	return value;
    }

    public void setValue(E value) {
	this.value = value;
    }

}
