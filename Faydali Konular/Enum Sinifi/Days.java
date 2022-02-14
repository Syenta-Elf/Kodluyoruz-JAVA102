public class Days {
    public static final Days Monday = new Days(1);
    public static final Days Tuesday = new Days(2);
    public static final Days Wednesday = new Days(3);
    public static final Days Thursday = new Days(4);
    public static final Days Friday = new Days(5);
    public static final Days Saturday = new Days(6);
    public static final Days Sunday = new Days(7);

    private int day;
    public Days(int day)
    {
        setDay(day);
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
}