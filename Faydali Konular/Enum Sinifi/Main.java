class Main{
    public static void main(String[] args) {

        System.out.println(Days.Monday);
        DaysEnum monday = DaysEnum.Monday;
        System.out.println(monday);
        System.out.println(monday.getDaysEnum());
        DaysEnum[] values = DaysEnum.values();
        for (DaysEnum daysEnum : values) {
            System.out.println(daysEnum.getDaysEnum()+":"+daysEnum);
        }
    }
}