public class TimeDuration {
    private int second;
    private int minute;
    private int hour;
    public TimeDuration(int seconds) throws BadBadValueException {
        if (seconds < 0) {
            throw new BadBadValueException ();
        } else {
            hour = seconds / 3600;
            minute = (seconds % 3600) / 60;
            second = (seconds % 3600) % 60;
        }
    }
public String toString(){
     return this.hour + "h" + this.minute + "m" + this.second +"s";
    }
}

