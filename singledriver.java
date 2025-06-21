package dsa;

public class singledriver {

	public static void main(String[] args) {
		singlylinkedlist s=new singlylinkedlist();
        System.out.println(s.isEmpty());
        s.append(1);
        s.append(2);
        s.append(5);
        s.append(6);
        s.append(7);
        s.print();
        s.insert(4,2);
        s.print();
        s.deletefirst();
        
	}

}
