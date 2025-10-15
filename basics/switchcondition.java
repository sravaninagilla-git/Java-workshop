public class switchcondition {
    public static void main(String[] args) {
        int dayNumber = 3;
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("today is:" +dayName);
    }

}
