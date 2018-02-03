package creationAbsFactoryPat.absFactory;

public abstract class FinancialToolsFactory {
	public abstract TaxProcessor createTaxProcessor();
	public abstract ShipFeeProcessor createShipFeeProcessor();
}

class CanadaFinancialToolsFactory extends FinancialToolsFactory{
	public TaxProcessor createTaxProcessor(){
		return new CanadaTaxProcessor();
	}
	public ShipFeeProcessor createShipFeeProcessor(){
		return new CanadaShipFeeProcessor();
	}
}

class EuropeFinancialToolsFactory extends FinancialToolsFactory{
	public TaxProcessor createTaxProcessor(){
		return new EuropeTaxProcessor();
	}
	public ShipFeeProcessor createShipFeeProcessor(){
		return new EuropeShipFeeProcessor();
	}
}
