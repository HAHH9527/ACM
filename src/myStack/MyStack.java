package myStack;

/**
 * @version 1.1
 * 
 * @author HAHH9527
 *
 * @param <E>
 */
public class MyStack<E> {
    private int size;
    private A<E> top;

    public MyStack() {
	size = 0;
    }

    /**
     * 入栈
     * 
     * @param obj
     */
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

    /**
     * 取得栈顶元素，不弹出
     * 
     * @return 栈顶元素
     */
    public E peek() {
	return top.getValue();
    }

    /**
     * 取得栈顶元素，并弹出
     * 
     * @return 被弹出的栈顶元素
     */
    public E pop() {
	A<E> temp = top;
	top = top.getHead();
	size--;
	return temp.getValue();
    }

    /**
     * 查找obj在此栈的第哪个位置
     * 
     * @param obj
     * @return obj所在位置
     */
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

    /**
     * 验证此栈是否为空栈
     * 
     * @return 空栈返回true
     */
    public boolean empty() {
	if (size == 0) {
	    return true;
	} else {
	    return false;
	}
    }

    /**
     * 
     * @return 此栈的长度
     */
    public int getSize() {
	return size;
    }

}
