import ConfigManagement.ConfigManager;
import ObjectMapping.DataTransfer.*;
import ObjectMapping.Deserialiser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPostcodesDeserialiserJsonTests {
    private static GeoPostcodeRequestDto geoPostcodeRequestDto;
    private static List<GeoPostcodeDto> postcodeDtos;

    @BeforeAll
    private static void setup(){
        File testFile = new File(ConfigManager.geoLookupPostcodesTestFileLocation());
        geoPostcodeRequestDto = new Deserialiser<>(GeoPostcodeRequestDto.class).postcodeRequestData(testFile);
        postcodeDtos = geoPostcodeRequestDto.getResult();
    }

    @Test
    public void getRequestStatusTest(){
        assertEquals( 200, geoPostcodeRequestDto.getStatus());
    }

    @Test
    public void getQueriesTest(){
        assertEquals( 1, postcodeDtos.size());
    }

    @Test
    public void getPostcodeTest(){
        assertEquals( "ML3 8SY", postcodeDtos.get(0).getPostcode());
    }

    @Test
    public void getDistanceTest(){
        assertEquals( 43.02678208, postcodeDtos.get(0).getDistance());
    }
}