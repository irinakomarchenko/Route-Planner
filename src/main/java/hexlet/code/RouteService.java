package hexlet.code;

import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class RouteService {
    private static final String ORS_API_KEY = "5b3ce3597851110001cf62486cfb12130ec44a62b8266d8889a696e3";
    private static final String ORS_URL = "https://api.openrouteservice.org/v2/directions/driving-car";

    public JsonObject getRoute(String startCoordinates, String endCoordinates) throws URISyntaxException, IOException {
        final JsonObject routeResponse = HttpRequestHelper.doGetRequest(ORS_URL, Map.of(
                "api_key", ORS_API_KEY,
                "start", startCoordinates,
                "end", endCoordinates
        )).getAsJsonObject();

        if (!routeResponse.has("features") || routeResponse.getAsJsonArray("features").size() == 0) {
            return null;
        }
        return routeResponse;
    }
}
