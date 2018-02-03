package structureHybrid.DecoratorBuilderOP.DBOPlatform.Factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import structureHybrid.DecoratorBuilderOP.DBOPlatform.Decorator.DecoNullImpl;
import structureHybrid.DecoratorBuilderOP.DBOPlatform.Decorator.DecoOneImpl;
import structureHybrid.DecoratorBuilderOP.DBOPlatform.Decorator.DecoTwoImpl;
import structureHybrid.DecoratorBuilderOP.DBOPlatform.Decorator.DecoratorPlatform;
import structureHybrid.DecoratorBuilderOP.DBOPlatform.Decorator.DecoratorType;

public class DecoratorFactory {
	public List<DecoratorPlatform> decorators;
	public DecoratorFactory(){
		decorators=new ArrayList<DecoratorPlatform>();
		decorators.add(new DecoOneImpl(DecoratorType.DECOONE));
		decorators.add(new DecoTwoImpl(DecoratorType.DECOTWO));
	}
	
	public DecoratorPlatform getDecorator(DecoratorType type){
		Iterator<DecoratorPlatform> iter=decorators.iterator();
		while(iter.hasNext()){
			DecoratorPlatform platform=iter.next();
			if(platform.decoType.equals(type))
				return platform;
		}
		return new DecoNullImpl();
	}

}
