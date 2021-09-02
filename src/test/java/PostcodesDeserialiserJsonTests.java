import ConfigManagement.ConfigManager;
import ObjectMapping.DataTransfer.PostcodeDto;
import ObjectMapping.DataTransfer.PostcodeRequestDto;
import ObjectMapping.Deserialise.PostcodesDeserialiser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class PostcodesDeserialiserJsonTests {
    private static PostcodeRequestDto postcodeRequestDto;
    private static PostcodeDto postcodeDto;

    @BeforeAll
    private static void setup(){
        postcodeRequestDto = new PostcodesDeserialiser().postcodeRequestData(new File(ConfigManager.postcodeTestFileLocation()));
        postcodeDto = postcodeRequestDto.getResult();
    }

    @Test
    public void getRequestStatusTest(){
        assertEquals( 200, postcodeRequestDto.getStatus());
    }

    @Test
    public void getPostcodeTest(){
        assertEquals( "ML3 8SY", postcodeDto.getPostcode());
    }

    @Test
    public void getQualityTest(){
        assertEquals( 1, postcodeDto.getQuality());
    }

    @Test
    public void getEastingsTest(){
        assertEquals( 270008, postcodeDto.getEastings());
    }

    @Test
    public void getNorthingsTest(){
        assertEquals( 653357, postcodeDto.getNorthings());
    }

    @Test
    public void getCountryTest(){
        assertEquals( "Scotland", postcodeDto.getCountry());
    }

    @Test
    public void getNhsHaTest(){
        assertEquals( "Lanarkshire", postcodeDto.getNhsHa());
    }

    @Test
    public void getLongitudeTest(){
        assertEquals( -4.072924, postcodeDto.getLongitude());
    }

    @Test
    public void getAdminWard(){
        assertEquals( "Hamilton South", postcodeDto.getAdminWard());
    }

    @Test
    public void getNutsCode(){
        assertEquals( "TLM95", postcodeDto.getCodes().getNuts());
    }

    @Test
    public void getParliamentaryConstituencyCode(){
        assertEquals( "S14000056", postcodeDto.getCodes().getParliamentaryConstituency());
    }
}