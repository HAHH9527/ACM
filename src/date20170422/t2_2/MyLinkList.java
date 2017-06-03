package date20170422.t2_2;

/**
 * @time 2017年4月18日22点02分（将头尾节点都不储存数据
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
    /**
     * 添加obj到链表最后
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
     * 在第i个元素后面插入obj
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
     * 删除下标第i个的元素
     * 
     * @return 被删掉的元素
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
     * @return 下标为i的元素的值
     */
    public E get(int i) throws Exception {
	goTo(i);
	return (E) current.getValue();
    }

    @Override
    /**
     * @return 链表的长度
     */
    public int size() {
	return size;
    }

    @Override
    /**
     * 搜索obj的位置
     * 
     * @return obj对应的下标
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
     * 将链表转换成数组
     * 
     * @return 数组
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
     * 将current指向对应的下标
     * 
     * @param i
     * @throws Exception
     */
    private void goTo(int i) throws Exception {
	if (i >= size || i < 0) {
	    throw new Exception("在LinkList中找不到对应Obj");
	}
	current = head.getNext();
	for (int count = 1; count <= i; count++) {
	    current = current.getNext();
	}
    }

}
