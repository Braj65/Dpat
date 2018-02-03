package structuralFlyWeightPat.realEx;

import java.util.Hashtable;

public class UnitFactory {
	
	private Hashtable<String, Unit> units=new Hashtable<String, Unit>();
	
	public Unit getUnit(String type){
		if(units.containsKey(type)){
			return units.get(type);
		}
		
		Unit unit;
		
		switch (type) {
		case "Infantry":
			Soldier sold1=new Soldier();
			sold1.Name="Standard Infantry";
			sold1.Armor=5;
			unit=sold1;
			break;
			
		case "Marine":
			Soldier sold2=new Soldier();
			sold2.Name="Marines";
			sold2.Armor=10;
			unit=sold2;
			break;

		default:
			Tank t=new Tank();
			t.Name="Tanker";
			t.Armor=100;
			unit=t;
			break;
		}
		units.put(type, unit);
		return unit;
	}

}
