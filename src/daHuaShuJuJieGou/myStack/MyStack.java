package daHuaShuJuJieGou.myStack;

/**
 * @param <E>
 * @author HAHH9527
 * @version 1.1.1
 */
public class MyStack<E> {
    private int size;
    private A<E> top;

    public MyStack() {
        size = 0;
    }

    /**
     * ��ջ
     *
     * @param obj
     */
    public void push(E obj) {
        A<E> temp = new A<E>(obj);
        if (this.size == 0) {
            top = temp;
        } else {
            temp.setHead(top);
            top = temp;
        }
        size++;
    }

    /**
     * ȡ��ջ��Ԫ�أ�������
     *
     * @return ջ��Ԫ��
     */
    public E peek() {
        return top.getValue();
    }

    /**
     * ȡ��ջ��Ԫ�أ�������
     *
     * @return ��������ջ��Ԫ��
     */
    public E pop() {
        A<E> temp = top;
        top = top.getHead();
        size--;
        return temp.getValue();
    }

    /**
     * ����obj�ڴ�ջ�ĵ��ĸ�λ��
     *
     * @param obj
     * @return obj����λ��
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
     * ��֤��ջ�Ƿ�Ϊ��ջ
     *
     * @return ��ջ����true
     */
    public boolean empty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return ��ջ�ĳ���
     */
    public int getSize() {
        return size;
    }

}
