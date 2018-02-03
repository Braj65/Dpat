package creationAbsFactoryPat.absFactory;

public abstract class ShipFeeProcessor {
	abstract void calculateShipFee(Order order);
}
abstract class TaxProcessor{
	abstract void calculateTaxes(Order order);
}
class EuropeShipFeeProcessor extends ShipFeeProcessor{
	public void calculateShipFee(Order order){
		System.out.println("Inside europeshipfeeprocessor- calculateshipfee");
	}
}
class CanadaShipFeeProcessor extends ShipFeeProcessor{
	public void calculateShipFee(Order order){
		System.out.println("Inside canadashipfeeprocessor- calculateshipfee");
	}
}

class EuropeTaxProcessor extends TaxProcessor{
	public void calculateTaxes(Order order){
		System.out.println("Inside EuropeTaxProcessor- calculateTaxes");
	}
}
class CanadaTaxProcessor extends TaxProcessor{
	public void calculateTaxes(Order order){
		System.out.println("Inside CanadaTaxProcessor- calculateTaxes");
	}
}
