package structuralAdapterPat.realEx;

public class Manager {
	
	
	public static void main(String[] args){
		DataSerializer dat=new DataSerializer(new XMLSerializerAdapter());
		System.out.println(dat.render());
	}
	
	

}
