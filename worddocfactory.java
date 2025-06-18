package factorypatterndesign;

public class worddocfactory extends documentfactory {
	public document createdoc() {
		
		return new worddocument();
	}
}
