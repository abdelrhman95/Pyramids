import java.io.*;
import java.util.*;

public class PyramidCSVDAO {

      public List<Pyramid> readPyramidsFromCsv(String Filename) throws FileNotFoundException, IOException {

        List<Pyramid> pyramidInfo = new ArrayList<>();
        FileReader fr = new FileReader(Filename);
        BufferedReader reader = new BufferedReader(fr);
        String[] parts;
        Pyramid pd;
        String line;
        line = reader.readLine();
        
         do {
            line=reader.readLine();
            if (line !=null )
            { 
               parts=line.split(",");
               if ( parts[7].equals(""))
               {   
                   
                   pd= new Pyramid(parts[0],parts[2],parts[4],0);
                   pyramidInfo.add(pd);
               }
               else {
                   pd= new Pyramid(parts[0],parts[2],parts[4],Double.parseDouble(parts[7]));
                   pyramidInfo.add(pd);
               }
               
                 }
}         while(line != null);
        
        
      
        return pyramidInfo;
    }
}
    
    
   