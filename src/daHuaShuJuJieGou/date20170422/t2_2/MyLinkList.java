package daHuaShuJuJieGou.date20170422.t2_2;

/**
 * @param <E>
 * @author 9527Number
 * @version 1.2
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
    /**
     * ���obj���������
     */
    public void add(E obj) throws Exception {
        A newA = new A(obj);
        current = end.getPre();
        current.setNext(newA);
        newA.setPre(current);
        end.setPre(newA);
        newA.setNext(end);
        size++;
    }

    @Override
    /**
     * �ڵ�i��Ԫ�غ������obj
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
     * ɾ���±��i����Ԫ��
     *
     * @return ��ɾ����Ԫ��
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
    /**
     * @return �±�Ϊi��Ԫ�ص�ֵ
     */
    public E get(int i) throws Exception {
        goTo(i);
        return (E) current.getValue();
    }

    @Override
    /**
     * @return ����ĳ���
     */
    public int size() {
        return size;
    }

    @Override
    /**
     * ����obj��λ��
     *
     * @return obj��Ӧ���±�
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

    /**
     * ������ת��������
     *
     * @return ����
     */
    public E[] toArrary() {
        Object[] ret = new Object[size];
        current = head;
        for (int i = 0; i < ret.length; i++) {
            current = current.getNext();
            ret[i] = current.getValue();
        }
        return (E[]) ret;
    }

    /**
     * ��currentָ���Ӧ���±�
     *
     * @param i
     * @throws Exception
     */
    private void goTo(int i) throws Exception {
        if (i >= size || i < 0) {
            throw new Exception("��LinkList���Ҳ�����ӦObj");
        }
        current = head.getNext();
        for (int count = 1; count <= i; count++) {
            current = current.getNext();
        }
    }

}
