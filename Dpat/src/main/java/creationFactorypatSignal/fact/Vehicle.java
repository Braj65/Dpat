package creationFactorypatSignal.fact;

public abstract class Vehicle {
	
	private double maxSpeed;
	private double speed=0;
	private double length;
	
	protected Vehicle(double length, double maxSpeed){
		this.length=length;
		this.maxSpeed=maxSpeed;
	}
	
	public double getSpeed(){
		return this.speed;
		
	}
	public double getMaxSpeed(){
		return this.maxSpeed;
	}
	public double getLength(){
		return this.length;
	}
	public void accelerate(double deltav){
		if(this.speed+deltav<0){
			this.speed=0.0;
		}
		else if(speed+deltav>maxSpeed){
			speed=maxSpeed;
		}else{
			speed=speed+deltav;
		}
	}
	public void decelerate(double deltav){
		accelerate(-deltav);
	}
	
	public String toString(){
		return this.getClass().getName();
	}
	
}
