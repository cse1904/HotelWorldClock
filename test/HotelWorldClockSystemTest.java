import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* HotelWorldClockSystem Tester. 
* 
* @author <sec>
* @since <pre>Oct 7, 2018</pre> 
* @version 1.0 
*/ 
public class HotelWorldClockSystemTest {
    private UtcTime utcTime;
    private PhoneClock phone;

    @Before
    public void before() throws Exception {
        this.utcTime=new UtcTime();
        this.phone=new PhoneClock(8);
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: main(String[] args)
    *
    */
    @Test
    public void the_time_of_clock_London_should_be_9_after_the_phone_clock_is_set_to_17_Beijing_time() {
        CityClock londonClock=new CityClock(0);
        utcTime.attach("london",londonClock);
        phone.setUtcTime(utcTime);
        phone.setLocalTime(17);
        assertEquals(9,londonClock.getTime());
    }
    @Test
    public void the_time_of_clock_NewYork_should_be_4_after_the_phone_clock_is_set_to_17_Beijing_time(){
        CityClock newYorkClock=new CityClock(-5);
        utcTime.attach("newYork",newYorkClock);
        phone.setUtcTime(utcTime);
        phone.setLocalTime(17);
        assertEquals(4,newYorkClock.getTime());

    }
    @Test
    public void the_time_of_clock_Moscow_should_be_13_after_the_phone_clock_is_set_to_17_Beijing_time(){
        CityClock moscowClock=new CityClock(4);
        utcTime.attach("moscow",moscowClock);
        phone.setUtcTime(utcTime);
        phone.setLocalTime(17);
        assertEquals(13,moscowClock.getTime());

    }
    @Test
    public void the_time_of_clock_Sydney_should_be_19_after_the_phone_clock_is_set_to_17_Beijing_time(){
        CityClock sydneyClock=new CityClock(10);
        utcTime.attach("sydney",sydneyClock);
        phone.setUtcTime(utcTime);
        phone.setLocalTime(17);
        assertEquals(19,sydneyClock.getTime());

    }
    @Test
    public void the_time_of_clock_London_and_NewYork_should_be_9_and_4_respectively_after_the_phone_clock_is_set_to_17_Beijing_time(){
        CityClock londonClock=new CityClock(0);
        CityClock newYorkClock=new CityClock(-5);
        utcTime.attach("london",londonClock);
        utcTime.attach("newYork",newYorkClock);
        phone.setUtcTime(utcTime);
        phone.setLocalTime(17);
        assertEquals(9,londonClock.getTime());
        assertEquals(4,newYorkClock.getTime());

    }

    @Test
    public void the_time_of_the_phone_clock_should_be_set_correctly_after_its_setTime_method_is_invoked() {
        phone.setUtcTime(utcTime);
        phone.setLocalTime(17);
        assertEquals(17, phone.getTime());
    }

} 
