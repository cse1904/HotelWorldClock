/**
 * @author sec
 */
public class PhoneClock extends Clock{
    public UtcTime utcTime;
    public PhoneClock(int utcOffset){
        super(utcOffset);
    }

    public void setLocalTime(int localTime){
        super.localTime=localTime;
        this.utcTime.setUtcZeroTime(localTime-utcOffset);
    }

    public void setUtcTime(UtcTime utcTime){
        this.utcTime=utcTime;
    }
}
