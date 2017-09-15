package daHuaShuJuJieGou.date20170422.t1;

/**
 * @author 9527Number
 */
public class A {
    private Object value;

    private A pre;
    private A next;

    public A(Object value) {
        this.value = value;
    }

    public A() {
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public A getPre() {
        return pre;
    }

    public void setPre(A pre) {
        this.pre = pre;
    }

    public A getNext() {
        return next;
    }

    public void setNext(A next) {
        this.next = next;
    }

}
