package data20170422.t1;

/**
 * @time 2017年4月18日22点02分（将头尾节点都不储存数据
 * 
 * @author 9527Number
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
     * 可能有问题的插入（在第一个元素之后插入用的是1，而不是0
     * 
     * @time 2017年4月18日11点19分（强制改变i暂时解决问题
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
     * 不能被正确使用的方法
     * 
     * @time 2017年4月18日11点18分（删除最后一个还是有问题
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
     * 未写的方法
     * 
     * @time 2017年4月18日11点20分（搜索方法已完成
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
	    throw new Exception("在LinkList中找不到对应Obj");
	}
	current = head.getNext();
	// System.out.println("goTo()=" + current.getPre());
	for (int count = 1; count <= i; count++) {
	    current = current.getNext();
	}
    }

}
