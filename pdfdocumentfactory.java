package factorypatterndesign;

public class pdfdocumentfactory extends documentfactory {
	@Override
 public document createdoc() {
	 return new pdfdocument();
 }
}
