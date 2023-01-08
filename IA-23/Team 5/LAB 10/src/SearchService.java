import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SearchService {
    String name;
    List<Shops> shopsList = new ArrayList<Shops>();

    public SearchService(String serviceName){
        this.name = serviceName;
    }

    public void addAllShops(Collection<Shops> shops) {
        this.shopsList.addAll(shops);
    }

    @Override
    public String toString(){
        return name + " -- " + shopsList;
    }
}
