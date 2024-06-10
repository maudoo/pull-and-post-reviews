
import com.google.maps.GeocodingApi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        GeoApiContext context = new GeoApiContext.Builder();
        apiKey("Your API_KEY"); // Replace with your actual API key
        build();

        try {
            GeocodingResult[] results = GeocodingApi.geocode(context, "1600 Amphitheatre Parkway, Mountain View, CA").await();
            System.out.println(results[0].formattedAddress);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}