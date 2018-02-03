package structuralAdapterPat.realEx;

public class XMLSerializerAdapter implements ISerializerAdapter{
	XmlSerializer x=new XmlSerializer ();
	@Override
	public String serialize(Object obj) {
		return x.serializer(obj);		
	}

}
