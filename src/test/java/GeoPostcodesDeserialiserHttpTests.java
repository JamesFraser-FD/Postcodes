import ConfigManagement.ConfigManager;
import HttpManagement.BulkPostcodesHttpManager;
import HttpManagement.GeoLookupPostcodesHttpManager;
import ObjectMapping.DataTransfer.GeoPostcodeDto;
import ObjectMapping.DataTransfer.GeoPostcodeRequestDto;
import ObjectMapping.Deserialise.BulkPostcodesDeserialiser;
import ObjectMapping.Deserialise.GeoLookupPostcodesDeserialiser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPostcodesDeserialiserHttpTests {
    private static GeoPostcodeRequestDto geoPostcodeRequestDto;
    private static List<GeoPostcodeDto> postcodeDtos;

    @BeforeAll
    private static void setup(){
        geoPostcodeRequestDto = new GeoLookupPostcodesDeserialiser().postcodeRequestData(new File(ConfigManager.geoLookupPostcodesTestFileLocation()));
        postcodeDtos = geoPostcodeRequestDto.getResult();

        GeoLookupPostcodesHttpManager geoPostcodesHttpManager = new GeoLookupPostcodesHttpManager(55.756359, -4.072492);
        geoPostcodesHttpManager.makeUrlCall();
        geoPostcodeRequestDto = new GeoLookupPostcodesDeserialiser().postcodeRequestData(geoPostcodesHttpManager.getResponseBody());
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