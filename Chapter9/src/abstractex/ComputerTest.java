package abstractex;

public class ComputerTest {
	public static void main(String[] args) {
		Computer c2 = new DeskTop();
		Computer c4 = new MyNoteBook();
		
		c2.display();
		c4.display();
		
	}

}
