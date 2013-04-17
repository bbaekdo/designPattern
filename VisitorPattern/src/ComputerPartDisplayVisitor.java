
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Keyboard keyboard) {
		// TODO Auto-generated method stub
		System.out.println("display keyboard");
	}

	@Override
	public void visit(Mouse mouse) {
		// TODO Auto-generated method stub
		System.out.println("display mouse");
	}

	@Override
	public void visit(Monitor monitor) {
		// TODO Auto-generated method stub
		System.out.println("display monitor");
	}

	@Override
	public void visit(Computer computer) {
		// TODO Auto-generated method stub
		System.out.println("display computer");
	}

}
