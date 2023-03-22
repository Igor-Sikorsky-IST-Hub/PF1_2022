import java.util.*;

public class Institute {
	String name;
	private HashSet<Faculty> allFacs = new HashSet<>();
	
    public Institute(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void addFac(Faculty newfac){
    	allFacs.add(newfac);
    }

    public HashSet<Faculty> getAllFacs() {
        return allFacs;
    }  
}
