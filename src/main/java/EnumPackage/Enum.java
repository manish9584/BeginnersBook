package EnumPackage;

enum Day
{
    sunday,monday,wednesday,thursday,friday,saturday;

  //  public static void Valueof(String str) {

}
public class Enum {

    Day day;

    public Enum(Day day)
    {
        this.day = day;
    }

    public Enum(Object valueof) {
    }
        public void DayIsLike()
    {
        switch (day)
        {
            case monday:
                System.out.println("Monday are bad.");
                break;
            case friday:
                System.out.println("Friday are better.");
                break;
            case saturday:
            case sunday:
                System.out.println("Weekends are better");
                break;
            default:
                System.out.println("Meedweeks are so-so");
                break;
        }
    }
    public static void main(String[] args) {
        String str = "sunday";

        Enum e1 = new Enum(Day.valueOf(str));
        e1.DayIsLike();
     //System.out.println(c1);
    }
}

