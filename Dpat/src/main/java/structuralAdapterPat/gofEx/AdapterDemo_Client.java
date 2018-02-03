package structuralAdapterPat.gofEx;

public class AdapterDemo_Client {
	public static void main(String[] args) {
		  System.out.println("class adapter test");
		  TemperatureInfo_ITarget tempInfo = new TemperatureClassPresenter_Adapter();
		  testTempInfo(tempInfo);
		  // object adapter
		  System.out.println("\nobject adapter test");
		  tempInfo = new TemperatureObjectPresenter_Adapter();
		  testTempInfo(tempInfo);
		 }
		 public static void testTempInfo(TemperatureInfo_ITarget tempInfo) {
		  tempInfo.setTemperatureInC(0);
		  System.out.println("temp in C:" + tempInfo.getTemperatureInC());
		  System.out.println("temp in F:" + tempInfo.getTemperatureInF());
		  tempInfo.setTemperatureInF(85);
		  System.out.println("temp in C:" + tempInfo.getTemperatureInC());
		  System.out.println("temp in F:" + tempInfo.getTemperatureInF());
		 }
}
