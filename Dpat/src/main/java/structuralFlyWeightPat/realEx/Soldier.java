package structuralFlyWeightPat.realEx;

public class Soldier extends Unit{
	public static int numberOfInstances;
	
	public Soldier(){
		numberOfInstances++;
	}

	@Override
	public void fireAt(Target target) {
		System.out.println("Shooting at target from soldier");
		
	}
	
	

}
