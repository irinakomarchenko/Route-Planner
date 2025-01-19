package hexlet.code;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        final Scanner scanner = new Scanner(System.in);


        System.out.print("Введите начальный адрес: ");
        final String addressA = scanner.nextLine();
        final LocationService locationService = new LocationService();

        final String coordinatesA = locationService.getCoordinates(addressA);
        if (coordinatesA == null) {
            System.err.println("Адрес не найден: " + addressA);
            return;
        }

        // Ввод конечного адреса
        System.out.print("Введите конечный адрес: ");
        final String addressB = scanner.nextLine();

        final String coordinatesB = locationService.getCoordinates(addressB);
        if (coordinatesB == null) {
            System.err.println("Адрес не найден: " + addressB);
            return;
        }


        final RouteService routeService = new RouteService();
        final JsonObject routeResponse = routeService.getRoute(coordinatesA, coordinatesB);

        if (routeResponse == null) {
            System.err.println("Маршрут не найден между заданными точками.");
            return;
        }

        final RouteFormatter formatter = new RouteFormatter();
        formatter.printRoute(routeResponse);
    }
}