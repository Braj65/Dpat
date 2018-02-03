package creationHybrids.factoryObjectPoolBuilder;

import creationHybrids.factoryObjectPoolBuilder.FOObjectPool.ObjectPool;
import creationHybrids.factoryObjectPoolBuilder.FOProdFamily.Product;
import creationHybrids.factoryObjectPoolBuilder.FOProdFamily.ProductBuilder;
import creationHybrids.factoryObjectPoolBuilder.FOProdFamily.ProductType;
import creationHybrids.factoryObjectPoolBuilder.FOProdFamily.productPool.ProductPool;

public class Client {
	
	public static void main(String[] args) {
		ObjectPool<Product> pool=new ProductPool();
		ProductPool nPool=(ProductPool) pool;
		nPool.setType(ProductType.TYPEONE);
		Product prod=new ProductBuilder().setProdId("11").setProdVal("one")
				.setProdType(ProductType.TYPEONE).build(pool);
		prod.execute();
		nPool.checkin(prod);
		
		nPool.setType(ProductType.TYPETWO);
		prod=new ProductBuilder().setProdId("22").setProdVal("two")
				.setProdType(ProductType.TYPETWO).build(pool);
		prod.execute();
		nPool.checkin(prod);
		
		nPool.setType(ProductType.TYPEONE);
		prod=new ProductBuilder().setProdId("33").setProdVal("three")
				.setProdType(ProductType.TYPEONE).build(pool);
		prod.execute();
		nPool.checkin(prod);
		
	}

}
