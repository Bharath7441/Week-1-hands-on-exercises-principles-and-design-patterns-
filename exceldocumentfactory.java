package factorypatterndesign;

public class exceldocumentfactory extends documentfactory {
   public document createdoc() {
	   return new exceldocument();
   }
}
