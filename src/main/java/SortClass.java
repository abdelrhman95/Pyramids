import java.util.Comparator;


public class SortClass implements Comparator<Pyramid> {
    
    @Override
    public int compare(Pyramid p1, Pyramid p2) {

        return (int) (p2.getHeight() - p1.getHeight());
    }
    
    
}
