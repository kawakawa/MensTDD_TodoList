import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class TodoDao {
	
	String fileName;
	File file;
	PrintWriter writer;
	
	public TodoDao(String fileName) throws FileNotFoundException {
		this.fileName = fileName;
		
		this.writer = new PrintWriter(new File(this.fileName));
		
	}
	
	void add(Todo todo) {
		this.writer.write(todo.toString());
		this.writer.flush();
	}
}
