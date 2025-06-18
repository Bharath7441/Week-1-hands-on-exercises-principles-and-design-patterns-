package singlrtonpatterndesign;

public class loggerdriver {

	public static void main(String[] args) {
		logger log1=logger.getlogger();
		logger log2=logger.getlogger();
		log1.log("first obj created");
		log2.log("second obj created");
        if(log1==log2) {
        	System.out.println("singleton pattern used");
        }else System.out.println("not works");
	}

}
