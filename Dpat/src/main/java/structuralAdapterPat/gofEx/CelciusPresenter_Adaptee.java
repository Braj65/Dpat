package structuralAdapterPat.gofEx;

public class CelciusPresenter_Adaptee {
	double temperatureInC;
	 public CelciusPresenter_Adaptee() {
	 }
	 public double getTemperature() {
	  return temperatureInC;
	 }
	 public void setTemperature(double temperatureInC) {
	  this.temperatureInC = temperatureInC;
	 }
}
