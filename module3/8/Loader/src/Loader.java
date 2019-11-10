import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;

import java.util.List;

public class Loader
{
    public static void main (String [] args)
    {
        Airport airport = Airport.getInstance();
        System.out.println(airport.getAllAircrafts().size());
    }
}
