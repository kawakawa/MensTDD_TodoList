import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import src.TodoList
import org.junit.Test;


public class TodoListTest {

	@Test
	public void _1件Todoを追加されたことをテスト() {
		TodoList todoList=new TodoList();

		todoList.add(new Todo());

		int actual=target.getCount();
		int expected=1;
		assertThat(actual,is(expected));
	}

}
