
public class Computer implements ComputerPart {
	
	ComputerPart[] parts;
	
	public Computer() {
		// TODO Auto-generated constructor stub
		parts = new ComputerPart[] {new Keyboard(), new Monitor(), new Mouse()};
	}
	
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		// TODO Auto-generated method stub
		for (int i = 0; i < parts.length; i++) {
			parts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}

}
