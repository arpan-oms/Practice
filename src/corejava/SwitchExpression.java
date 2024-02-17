package corejava;
public class SwitchExpression {
    public static void main(String[] args) {
        String day = "Sun";
        String result = switch(day) {
          case "Sat", "Sun" -> "Weekend";
          case "Mon" -> "Weekday";
          default -> "Weekday";
        };
        System.out.println(result);
    }
}
