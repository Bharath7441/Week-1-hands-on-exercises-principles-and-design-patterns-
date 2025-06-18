package factorypatterndesign;

public class pdfdocument implements document{

	@Override
	public void open() {
		System.out.println("pdf doc is open");
		
	}

}
