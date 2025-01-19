package hexlet.code;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class LocationService {
    private static final String OSM_SEARCH_URL = "https://nominatim.openstreetmap.org/search";

    public String getCoordinates(String address) throws URISyntaxException, IOException {
        final JsonArray locations = HttpRequestHelper.doGetRequest(OSM_SEARCH_URL, Map.of(
                "q", address,
                "format", "json"
        )).getAsJsonArray();

        if (locations.size() == 0) {
            return null;
        }

        final JsonObject locationInfo = locations.get(0).getAsJsonObject();
        return locationInfo.getAsJsonPrimitive("lon").getAsString() + "," + locationInfo.getAsJsonPrimitive("lat").getAsString();
    }
}
