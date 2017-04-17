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
	// TODO 自动生成的方法存根
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
     * 可能有问题的插入（在第一个元素之后插入用的是1，而不是0
     */
    public void add(int i, T obj) throws Exception {
	// TODO 自动生成的方法存根
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
     * 不能被正确使用的方法
     */
    public T del(int i) throws Exception {
	// TODO 自动生成的方法存根
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
	// TODO 自动生成的方法存根
	goTo(i);
	return (T) current.getValue();
    }

    @Override
    public int size() {
	// TODO 自动生成的方法存根
	return size;
    }

    @Override
    /**
     * 未写的方法
     */
    public int search(T obj) {
	// TODO 自动生成的方法存根
	return 0;
    }

    @Override
    public boolean isEmpty() {
	// TODO 自动生成的方法存根
	return head.getNext() == null;
    }

    private void goTo(int i) throws Exception {
	// TODO 自动生成的方法存根
	if (i >= size || i < 0) {
	    throw new Exception("在LinkList中找不到对应Obj");
	}
	current = head.getNext();
	for (int count = 1; count <= i; count++) {
	    current = current.getNext();
	}
    }

}
