package creationFactorypatSignal.fact;

public class ConcreteVehicleFactory extends VehicleFactory{
	
	public ConcreteVehicleFactory(){
		this(80, 10, 10, 0);
	}
	
	public ConcreteVehicleFactory(double chanceCar, double chanceBus, 
			double chanceBicycle, double chancePedestrian){
		super(chanceCar, chanceBus, chanceBicycle, chancePedestrian);
	}
	
	@Override
	public Vehicle createVehicle(){
		double r=Math.random();
		if(r<chanceCar)
			return new Car(6.0, 120);
		else if(r<chanceCar+chanceBus)
			return new Bus(18.0, 92);
		else if(r<chanceCar+chanceBus+chanceBicycle)
			return new Bicycle(1.5, 25);
		else if(r<chanceCar+chanceBus+chanceBicycle+chancePedestrian)
			return new Pedestrian(0, 4.0);
		else
			return null;		
	}

}
