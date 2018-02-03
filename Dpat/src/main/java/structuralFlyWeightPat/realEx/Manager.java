package structuralFlyWeightPat.realEx;

public class Manager {

	public static void main(String[] args) {
		UnitFactory fac=new UnitFactory();
		Target tank1=new Target();
		tank1.unitData=fac.getUnit("Tank");
		
		Target tank2=new Target();
		tank2.unitData=fac.getUnit("Tank");
		
		boolean result= tank1.unitData==tank2.unitData;
		int arm=tank1.unitData.Armor;
		
		System.out.println(result+" "+arm);
		System.out.println("tank instances "+Tank.numberOfInstances);

	}

}
