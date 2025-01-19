package hexlet.code;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class RouteFormatter {
    public void printRoute(JsonObject routeResponse) {
        final JsonObject routSegment = routeResponse
                .getAsJsonArray("features")
                .get(0)
                .getAsJsonObject()
                .getAsJsonObject("properties")
                .getAsJsonArray("segments")
                .get(0)
                .getAsJsonObject();

        System.out.println("Расстояние: " + routSegment.getAsJsonPrimitive("distance").getAsString() + " м.");
        System.out.println("Продолжительность маршрута: " + routSegment.getAsJsonPrimitive("duration").getAsString() + " сек.");

        for (JsonElement stepElement : routSegment.getAsJsonArray("steps")) {
            JsonObject step = stepElement.getAsJsonObject();
            System.out.println("-------------------------------");
            System.out.println("Дистанция: " + step.getAsJsonPrimitive("distance").getAsString() + " м.");
            System.out.println("Продолжительность: " + step.getAsJsonPrimitive("duration").getAsString() + " сек.");
            System.out.println("Инструкция: " + step.getAsJsonPrimitive("instruction").getAsString());
        }

    }
}
