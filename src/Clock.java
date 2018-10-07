/**
 * @author sec
 */
public class Clock {
    public int utcOffset=0;
    public int localTime=0;

    public Clock(int utcOffset){
        this.utcOffset=utcOffset;
    }
    public int getTime(){
        return this.localTime;
    }
}
