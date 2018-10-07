import java.util.HashMap;
/**
 * @author sec
 */
public class Clocks {
    protected HashMap<String,CityClock> clocks=new HashMap<String, CityClock>();

    public void attach(String cityName,CityClock clock){
        clocks.put(cityName,clock);
    }

    public void detach(String cityName){
        clocks.remove(cityName);
    }
}
