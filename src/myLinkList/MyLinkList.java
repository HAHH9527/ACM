package myLinkList;

/**
 * @time 2017��4��18��22��02�֣���ͷβ�ڵ㶼����������
 * 
 * @author 9527Number
 * 
 * @version 1.2
 *
 * @param <E>
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

    /**
     * ������ת��������
     * 
     * @return ��������
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
