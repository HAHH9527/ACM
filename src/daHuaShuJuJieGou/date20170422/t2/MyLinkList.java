package daHuaShuJuJieGou.date20170422.t2;

/**
 * @param <E>
 * @author 9527Number
 * @time 2017��4��18��22��02�֣���ͷβ�ڵ㶼����������
 */
public class MyLinkList<E> implements MyList<E> {
    int size;
    A head, current, end;

    public MyLinkList() {
        head = new A();
        end = new A();
        head.setNext(end);
        end.setPre(head);
    }

    @Override
    public void add(E obj) throws Exception {
        A newA = new A(obj);
        current = end.getPre();
        current.setNext(newA);
        newA.setPre(current);
        end.setPre(newA);
        newA.setNext(end);
        // if (head.getNext() == null) {
        // head.setNext(newA);
        // end = newA;
        // } else {
        // current.setNext(newA);
        // newA.setPre(current);
        // end = newA;
        // }
        size++;
    }

    @Override
    /**
     * ����������Ĳ��루�ڵ�һ��Ԫ��֮������õ���1��������0
     *
     * @time 2017��4��18��11��19�֣�ǿ�Ƹı�i��ʱ�������
     */
    public void add(int i, E obj) throws Exception {
        if (i == size - 1) {
            add(obj);
        } else {
            goTo(i);
            A newA = new A(obj);
            A temp = current.getNext();
            current.setNext(newA);
            temp.setPre(newA);
            newA.setNext(temp);
            newA.setPre(current);
            size++;
        }
    }

    @Override
    /**
     * ���ܱ���ȷʹ�õķ���
     *
     * @time 2017��4��18��11��18�֣�ɾ�����һ������������
     */
    public E del(int i) throws Exception {
        goTo(i);
        A tempPre = current.getPre();
        A tempNext = current.getNext();
        tempPre.setNext(tempNext);
        tempNext.setPre(tempPre);
        size--;
        return (E) current.getValue();
    }

    @Override
    public E get(int i) throws Exception {
        goTo(i);
        return (E) current.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    /**
     * δд�ķ���
     *
     * @time 2017��4��18��11��20�֣��������������
     */
    public int search(E obj) {
        int count = 0;
        current = head.getNext();
        while (obj != (E) current.getValue()) {
            if (current.getNext() == null) {
                return -1;
            }
            current = current.getNext();
            count++;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void goTo(int i) throws Exception {
        if (i >= size || i < 0) {
            throw new Exception("��LinkList���Ҳ�����ӦObj");
        }
        current = head.getNext();
        // System.out.println("goTo()=" + current.getPre());
        for (int count = 1; count <= i; count++) {
            current = current.getNext();
        }
    }

}
