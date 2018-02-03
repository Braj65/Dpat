package creationBuilderpat.builder;

public class CallBuilderPatExCake {
	
	public static void main(String[] args){
		Cake white=new Cake.Builder().sugar(1).butter(1).eggs(2).
				vanilla(1).flour(1).bakingpowder(1).build();
	}

}
