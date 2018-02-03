package structCompositePat.codeEx;

public class Leaf extends Component{
	public Leaf(String name){
		super(name);
	}

	@Override
	public void operation() {
		System.out.println("Leaf. ");
	}

	@Override
	public void Display(int Depth) {
		System.out.println(" "+Depth);	
	}
}
