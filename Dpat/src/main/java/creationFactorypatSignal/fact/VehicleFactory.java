package creationFactorypatSignal.fact;

public abstract class VehicleFactory {
	
	double chanceCar;
	double chanceBus;
	double chanceBicycle;
	double chancePedestrian;
	
	public VehicleFactory(){
		this(80, 10, 10, 0);
	}
	public VehicleFactory(double chanceCar, double chanceBus, 
			double chanceBicycle, double chancePedestrian){
		if(chanceCar<0.0)
			chanceCar=0.0;
		if(chanceBus<0.0)
			chanceBus=0.0;
		if(chanceBicycle<0.0)
			chanceBicycle=0.0;
		if(chancePedestrian<0.0)
			chancePedestrian=0.0;
		
		double normalization = chanceCar + chanceBus 
			     + chanceBicycle + chancePedestrian;
		if (normalization == 0) 
			normalization = 1.0;
		
		this.chanceCar = chanceCar / normalization;
	    this.chanceBus = chanceBus / normalization;
	    this.chanceBicycle = chanceBicycle / normalization;
	    this.chancePedestrian = chancePedestrian / normalization;
	}
	
	public abstract Vehicle createVehicle();

}
