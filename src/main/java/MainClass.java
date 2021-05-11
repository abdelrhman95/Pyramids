
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException{
        // TODO code application logic here
        
        PyramidCSVDAO P = new PyramidCSVDAO();
        List <Pyramid> pyramids  = P.readPyramidsFromCsv("E:\\Pyramids.csv");
        
        Map < String, Integer > countbysite = new LinkedHashMap <> ();
        
        for (Pyramid p: pyramids)
        {
            String site  = p.getSite();
            Integer count = countbysite.get(site);
            
            if(count == null)
            {
                count = 1;
            }
            else{
                count++;
            }
            countbysite.put(site, count);
        }
        
        System.err.println(countbysite);
        
        
        
    }
}
