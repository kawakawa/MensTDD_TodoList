import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;


public class TodoListTest {

	@Test
	public void _1件Todoを追加されたことをテスト() throws FileNotFoundException {
		TodoList target = new TodoList();
		target.add(new Todo("aaaaa"));
	
		assertTrue(true);
	}
	
	@Test 
	public void 最後のが出てくることをテスト() throws FileNotFoundException {
		Todo todo = new Todo("aaaa");
		TodoList target = new TodoList();
		target.add(todo);
		
		assertEquals(todo, target.getLast());
	}
	
	@Test
	public void 最初のが出てくることをテスト() throws FileNotFoundException {
		Todo todo = new Todo("aaaa");
		TodoList target = new TodoList();
		target.add(todo);
		target.add(new Todo("bbbbb"));
		
		assertEquals(todo, target.getFirst());
	}
	
	@Test
	public void 全部得られることをテスト() throws FileNotFoundException {
		TodoList target = new TodoList();
		target.add(new Todo("1111"));
		target.add(new Todo("2222"));
		target.add(new Todo("3333"));
		assertEquals(3, target.getAll().size());
	}
	
	@Test
	public void 最初のを消すことをテスト() throws FileNotFoundException, KawaKawaException {
		TodoList target = new TodoList();
		Todo first = new Todo("1111");
		Todo second = new Todo("2222");
		Todo third = new Todo("3333");
		
		target.add(first);
		target.add(second);
		target.add(third);
		
		target.removeFist();
		
		assertEquals(second, target.getFirst());
	}
	
	@Test(expected = KawaKawaException.class)
	public void 一つもないのに最初のを消してみるテスト() throws FileNotFoundException, KawaKawaException {
		TodoList target = new TodoList();
		target.removeFist();
	}
	
	@Test
	public void 最後のを消すテスト() throws FileNotFoundException, KawaKawaException {
		TodoList target = new TodoList();
		Todo first = new Todo("1111");
		Todo second = new Todo("2222");
		Todo third = new Todo("3333");
		
		target.add(first);
		target.add(second);
		target.add(third);
		
		target.removeLast();
		
		assertEquals(second, target.getLast());
	}
	
	@Test(expected = KawaKawaException.class)
	public void 一つもないのに最後のを消してみるテスト() throws FileNotFoundException, KawaKawaException {
		TodoList target = new TodoList();
		target.removeLast();
	}
	
	@Test
	public void 全部消えることをテスト() throws FileNotFoundException {
		TodoList target = new TodoList();
		Todo first = new Todo("1111");
		Todo second = new Todo("2222");
		Todo third = new Todo("3333");
		
		target.add(first);
		target.add(second);
		target.add(third);
		
		target.clear();
		
		assertEquals(0, target.getCount());
	}

}
