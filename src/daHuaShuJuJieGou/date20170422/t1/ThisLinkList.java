package daHuaShuJuJieGou.date20170422.t1;

public class ThisLinkList<E> extends MyLinkList<E> {

    public ThisLinkList() {
	head = new A();
	end = new A();
	head.setNext(end);
	end.setPre(head);
	current = head;
    }

    public void toHome() {
	current = head;
    }

    public void toEnd() {
	current = end.getPre();
    }

    @Override
    public void add(E obj) throws Exception {
	A newA = new A(obj);
	A temp = current.getNext();
	current.setNext(newA);
	temp.setPre(newA);
	newA.setNext(temp);
	newA.setPre(current);
	current = current.getNext();
	size++;
    }

}
