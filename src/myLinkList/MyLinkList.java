package myLinkList;

/**
 * 
 * @author 9527Number
 *
 * @param <T>
 */
public class MyLinkList<T> implements MyList<T> {
    int size;
    A head, current, end;

    public MyLinkList() {
	head = new A();
	end = new A();
    }

    @Override
    public void add(T obj) throws Exception {
	// TODO �Զ����ɵķ������
	A newA = new A(obj);
	current = end;
	if (head.getNext() == null) {
	    head.setNext(newA);
	    end = newA;
	} else {
	    current.setNext(newA);
	    newA.setPre(current);
	    end = newA;
	}
	size++;
    }

    @Override
    /**
     * ����������Ĳ��루�ڵ�һ��Ԫ��֮������õ���1��������0
     */
    public void add(int i, T obj) throws Exception {
	// TODO �Զ����ɵķ������
	if (i == size) {
	    add(obj);
	} else {
	    goTo(i);
	    A newA = new A(obj);
	    A temp = current.getPre();
	    temp.setNext(newA);
	    current.setPre(newA);
	    newA.setNext(current);
	    newA.setPre(temp);
	    size++;
	}
    }

    @Override
    /**
     * ���ܱ���ȷʹ�õķ���
     */
    public T del(int i) throws Exception {
	// TODO �Զ����ɵķ������
	goTo(i);
	A tempPre = current.getPre();
	A tempNext = current.getNext();
	tempPre.setNext(tempNext);
	tempNext.setPre(tempPre);
	size--;
	return (T) current.getValue();
    }

    @Override
    public T get(int i) throws Exception {
	// TODO �Զ����ɵķ������
	goTo(i);
	return (T) current.getValue();
    }

    @Override
    public int size() {
	// TODO �Զ����ɵķ������
	return size;
    }

    @Override
    /**
     * δд�ķ���
     */
    public int search(T obj) {
	// TODO �Զ����ɵķ������
	return 0;
    }

    @Override
    public boolean isEmpty() {
	// TODO �Զ����ɵķ������
	return head.getNext() == null;
    }

    private void goTo(int i) throws Exception {
	// TODO �Զ����ɵķ������
	if (i >= size || i < 0) {
	    throw new Exception("��LinkList���Ҳ�����ӦObj");
	}
	current = head.getNext();
	for (int count = 1; count <= i; count++) {
	    current = current.getNext();
	}
    }

}
