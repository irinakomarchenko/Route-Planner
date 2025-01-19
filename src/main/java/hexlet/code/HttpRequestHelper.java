package hexlet.code;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HttpRequestHelper {
    private static final Gson GSON = new Gson();

    public static JsonElement doGetRequest(final String url, final Map<String, String> queryParams) throws URISyntaxException, IOException {
        final String queryString = buildQueryParams(queryParams);
        final HttpURLConnection connection = (HttpURLConnection) new URI(url + queryString)
                .toURL()
                .openConnection();
        connection.setRequestMethod("GET");

        if (connection.getResponseCode() != 200) {
            throw new IOException("Ошибка API: " + connection.getResponseCode() + " " + connection.getResponseMessage());
        }

        final Scanner scanner = new Scanner(connection.getInputStream());
        final StringBuilder response = new StringBuilder();

        while (scanner.hasNext()) {
            response.append(scanner.nextLine());
        }

        return GSON.fromJson(response.toString(), JsonElement.class);
    }

    private static String buildQueryParams(final Map<String, String> queryParams) {
        if (queryParams.isEmpty()) {
            return "";
        }

        final List<String> formattedParams = new ArrayList<>();
        for (final Map.Entry<String, String> param : queryParams.entrySet()) {
            formattedParams.add(param.getKey() + "=" + URLEncoder.encode(param.getValue(), StandardCharsets.UTF_8));
        }

        return "?" + String.join("&", formattedParams);
    }
}
