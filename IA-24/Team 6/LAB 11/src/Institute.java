import java.util.*;

public class Institute {
	public static final ComparatorSize COMPARATOR_SIZE = new ComparatorSize();
	String name;
	private TreeSet<Faculty> allFacs = new TreeSet<Faculty>(Institute.COMPARATOR_SIZE);
	
    public Institute(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void addFac(Faculty newfac){
    	allFacs.add(newfac);
    }

    public TreeSet<Faculty> getAllFacs() {
        return allFacs;
    }  
    public static class ComparatorSize implements Comparator<Faculty> {
        @Override
        public int compare(Faculty f1, Faculty f2) {
            int result = Integer.compare(f1.getSize(), f2.getSize());
            if (result != 0) {
                return result;
            }
            return f1.getName().compareTo(f2.getName());
        }
    }
}
