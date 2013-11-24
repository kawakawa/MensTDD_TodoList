import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;



public class TodoList {
	
	private TodoDao todoDao;
	private List<Todo> list;
	
	public TodoList() throws FileNotFoundException  {
		todoDao = new TodoDao("kawakawa");
		list = new ArrayList<Todo>();
	}


	public void add(Todo todo) {
		list.add(todo);
		todoDao.add(todo);
	}
	
	public Todo getLast() {
		return list.get(list.size() - 1);
	}
	
	public Todo getFirst() {
		return list.get(0);
	}

	public List<Todo> getAll() {
		return new ArrayList<Todo>(list);
	}

	public int getCount(){
		return list.size();
	}


	public void removeFist() throws KawaKawaException {
		if (list.size() == 0) {
			throw new KawaKawaException();
		}
		list.remove(0);
	}


	public void removeLast() throws KawaKawaException {
		if (list.size() == 0) {
			throw new KawaKawaException();
		}
		list.remove(list.size() - 1);
	}


	public void clear() {
		list.clear();
	}
}