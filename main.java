import java.util.List;
import static src.LZW.compress;
import static src.LZW.decompress;

/**
 *
 * @author Lucas_Pletsch
 */
public class main {
    
    public static void main(String[] args) {
        List<Integer> compressed = compress("gremiogremiogremiogremiogremiogremiogremiogremiogremio");
        //System.out.println(compressed);
        String decompressed = decompress(compressed);
        System.out.println(decompressed);
    }

}
