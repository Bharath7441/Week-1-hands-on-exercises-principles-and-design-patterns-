package factorypatterndesign;

public class factorydriver {

	public static void main(String[] args) {
		documentfactory wordfactory=new worddocfactory();
		document worddoc=wordfactory.createdoc();
        
		documentfactory pdffactory=new pdfdocumentfactory();
		document pdfdoc=pdffactory.createdoc();
		worddoc.open();
		pdfdoc.open();
	}

}
