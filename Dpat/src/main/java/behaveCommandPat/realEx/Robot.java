package behaveCommandPat.realEx;

public class Robot {
	
	public void Move(int dist){
		if(dist>0)
			System.out.println("Robo moved forwards "+dist);
		else
			System.out.println("Robo moved backwards "+dist);
	}
	
	public void takeSample(boolean take){
		if(take)
			System.out.println("Robo took sample");
		else
			System.out.println("Robo didn't took sample");
	}

}
