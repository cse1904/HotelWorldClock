/**
 * @author sec
 */
public class UtcTime extends Clocks{
    public int utcZeroTime;

    public int getUtcZeroTime(){
        return utcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime){
        this.utcZeroTime=utcZeroTime;
        notifyAllClocks();
    }

    public void notifyAllClocks(){
        for(CityClock clock:super.clocks.values()){
            clock.setLocalTimeFromUtc(this.utcZeroTime);
        }
    }

    public void printAllClocks(){
        for(String clockName : super.clocks.keySet()){
            System.out.println(clockName+':'+super.clocks.get(clockName).getTime());
        }
    }
}

