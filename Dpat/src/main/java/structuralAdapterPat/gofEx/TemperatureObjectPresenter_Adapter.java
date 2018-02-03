package structuralAdapterPat.gofEx;

public class TemperatureObjectPresenter_Adapter implements TemperatureInfo_ITarget{
	CelciusPresenter_Adaptee celciusPresenter;
	 public TemperatureObjectPresenter_Adapter() {
	  celciusPresenter = new CelciusPresenter_Adaptee();
	 }
	 @Override
	 public double getTemperatureInC() {
	  return celciusPresenter.getTemperature();
	 }
	 @Override
	 public double getTemperatureInF() {
	  return cToF(celciusPresenter.getTemperature());
	 }
	 @Override
	 public void setTemperatureInC(double temperatureInC) {
	  celciusPresenter.setTemperature(temperatureInC);
	 }
	 @Override
	 public void setTemperatureInF(double temperatureInF) {
	  celciusPresenter.setTemperature(fToC(temperatureInF));
	 }
	 private double fToC(double f) {
	  return ((f - 32) * 5 / 9);
	 }
	 private double cToF(double c) {
	  return ((c * 9 / 5) + 32);
	 }
}
