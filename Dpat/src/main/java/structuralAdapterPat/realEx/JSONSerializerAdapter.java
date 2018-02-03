package structuralAdapterPat.realEx;

public class JSONSerializerAdapter implements ISerializerAdapter{
	JavaScriptSerializer j=new JavaScriptSerializer();
	@Override
	public String serialize(Object obj) {
		return j.serializer(obj);		
	}

}
