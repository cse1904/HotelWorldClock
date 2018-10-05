import java.util.HashMap;
import java.util.Map;

/**
 * @author sec
 */
public class Clocks {
    protected Map<String,CityClock> clocks=new HashMap<String, CityClock>();

    public void attach(String cityName,CityClock clock){
        clocks.put(cityName,clock);
    }

    public void detach(String cityName){
        clocks.remove(cityName);
    }
}
