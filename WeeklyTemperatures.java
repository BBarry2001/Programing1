import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {  
    public static void main(String[] args) {
        ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);
        double totalTemp = 0;

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (String day : days) {
            System.out.print("Enter the average temperature for " + day + ": ");
            double temp = scanner.nextDouble();
            daysOfWeek.add(day);
            temperatures.add(temp);
            totalTemp += temp;
        }

        double weeklyAverage = totalTemp / 7;
        System.out.print("Enter 'day' for daily temperatures or 'week' for weekly summary: ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("day")) {
            for (int i = 0; i < daysOfWeek.size(); i++) {
                System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i));
            }
        } else if (choice.equalsIgnoreCase("week")) {
            for (int i = 0; i < daysOfWeek.size(); i++) {
                System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i));
            }
            System.out.println("Weekly Average: " + weeklyAverage);
        }
    }
}
