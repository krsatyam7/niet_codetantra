package q10610;
import java.util.*;
import java.util.stream.*;
public class CTJ10610 {
    public static String canVisitAllCities(List<Integer> Fuel, List<Integer> Cost) {
        int n = Fuel.size();
        int totalFuel = 0, totalCost = 0, currentFuel = 0, startIndex = 0;
        for (int i = 0; i < n; i++) {
            totalFuel += Fuel.get(i);
            totalCost += Cost.get(i);
            currentFuel += Fuel.get(i) - Cost.get(i);
            if (currentFuel < 0) {
                startIndex = i + 1;
                currentFuel = 0;
            }
        }
        return (totalFuel < totalCost) ? "-1" : String.valueOf(startIndex);
    }

    public static void main(String[] args) {
        List<Integer> Fuel = Arrays.stream(args[0].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        List<Integer> Cost = Arrays.stream(args[1].split(",")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        System.out.println(canVisitAllCities(Fuel, Cost));
    }
}
