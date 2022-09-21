package chapter3;
/*(Clock Class) Create a class called Clock that includes three instance variables—an hour
        (type int), a minute (type int) and a second (type int). Provide a constructor that initializes the
        three instance variables and assumes that the values provided are correct. Provide a set and a get
        method for each instance variable. The set method should set the value of all three variables to 0 if
        the value of hour is more than 23, the value of minute is more than 59, and the value of second is
        more than 59. Provide a method displayTime that display the time in an “hh:mm:ss” format. Write
        a test app named ClockTest that demonstrates class Clock’s capabilities.*/
public class Clock2 {
    private int hour = 23;
    private int minute = 59;
    private int second = 59;

    private int disPlayTime;

    public Clock2(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int hour){
             this.hour = hour;
    }

    public void setMinute(int minute) {
         this.minute = minute;
    }

    public void setSecond(int second) {
         this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void disPlayTime(int hour, int minute, int second){
//        disPlayTime = (hour,minute,second)
    }

}
