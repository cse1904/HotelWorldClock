///**
// * @author sec
// */
//public class HotelWorldClockSystem {
//    public static void main(String[] args){
//        UtcTime utcTime = new UtcTime();
//        utcTime.attach("beijing",new CityClock(8));
//        utcTime.attach("london",new CityClock(0));
//        utcTime.attach("moscow",new CityClock(4));
//        utcTime.attach("sydney",new CityClock(10));
//        utcTime.attach("newYork",new CityClock(-5));
//
//
//        PhoneClock phone = new PhoneClock(8);
//        phone.setUtcTime(utcTime);
//        phone.setLocalTime(10);
//
//        utcTime.printAllClocks();
//    }
//}
