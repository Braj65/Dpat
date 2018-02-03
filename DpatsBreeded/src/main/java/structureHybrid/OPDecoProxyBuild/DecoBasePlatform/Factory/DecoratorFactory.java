package structureHybrid.OPDecoProxyBuild.DecoBasePlatform.Factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import structureHybrid.OPDecoProxyBuild.DecoBasePlatform.Decorator.DecoNullImpl;
import structureHybrid.OPDecoProxyBuild.DecoBasePlatform.Decorator.DecoOneImpl;
import structureHybrid.OPDecoProxyBuild.DecoBasePlatform.Decorator.DecoTwoImpl;
import structureHybrid.OPDecoProxyBuild.DecoBasePlatform.Decorator.DecoratorPlatform;
import structureHybrid.OPDecoProxyBuild.DecoBasePlatform.Decorator.DecoratorType;

public class DecoratorFactory {
	
	private List<DecoratorPlatform> decoPool;
	
	public DecoratorFactory(){
		decoPool=new ArrayList<DecoratorPlatform>();
		decoPool.add(new DecoOneImpl(DecoratorType.DECOONE));
		decoPool.add(new DecoTwoImpl(DecoratorType.DECOTWO));
	}
	
	public DecoratorPlatform getDecorator(DecoratorType type){
		Iterator<DecoratorPlatform> iter=decoPool.iterator();
		DecoratorPlatform temp;
		while(iter.hasNext()){
			temp=iter.next();
			if(type.equals(temp.decoratorType)){
				return temp;
			}
		}
		return new DecoNullImpl();
	}

}
