package mall;

public interface Manager {

	public void add(Object o);

	public void remove(int i) throws Exception;

	public void modify(int i, Object o) throws Exception;

	public void display();
}