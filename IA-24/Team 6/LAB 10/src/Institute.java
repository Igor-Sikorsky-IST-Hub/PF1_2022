import java.util.*;

public class Institute {
	String name;
	private List<Faculty> allFacs = new ArrayList<>();
	
    public String getName() {
        return name;
    }
    
    public Institute(String name) {
        this.name = name;
    }
    
    public void addFacs(Collection<Faculty> Facs){
    	allFacs.addAll(Facs);
    }

    public List<Faculty> getAllFacs() {
        return allFacs;
    }
}
