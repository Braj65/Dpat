package structuralFlyWeightPat.realEx;

public class Tank extends Unit{
	public static int numberOfInstances;
	
	public Tank(){
		numberOfInstances++;
	}

	@Override
	public void fireAt(Target target) {
		System.out.println("Firing at target from tank");
	}
	

}
