/**
 * @author sec
 */
public class CityClock extends Clock{

    public CityClock(int utcOffset){
        super(utcOffset);
    }

    public void setLocalTime(int localTime){
        super.localTime=localTime;
    }

    public void setLocalTimeFromUtc(int utcZeroTime){
        this.localTime=(utcZeroTime+this.utcOffset+24)%24;
    }

}
