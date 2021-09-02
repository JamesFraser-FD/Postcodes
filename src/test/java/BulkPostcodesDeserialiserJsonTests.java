import ConfigManagement.ConfigManager;
import ObjectMapping.DataTransfer.BulkPostcodeRequestDto;
import ObjectMapping.DataTransfer.QueryDto;
import ObjectMapping.Deserialiser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BulkPostcodesDeserialiserJsonTests {
    private static BulkPostcodeRequestDto bulkPostcodeRequestDto;
    private static List<QueryDto> queryDtos;

    @BeforeAll
    private static void setup(){
        File testFile = new File(ConfigManager.bulkPostcodesTestFileLocation());
        bulkPostcodeRequestDto = new Deserialiser<>(BulkPostcodeRequestDto.class).postcodeRequestData(testFile);
        queryDtos = bulkPostcodeRequestDto.getResult();
    }

    @Test
    public void getRequestStatusTest(){
        assertEquals( 200, bulkPostcodeRequestDto.getStatus());
    }

    @Test
    public void getQueriesTest(){
        assertEquals( 2, queryDtos.size());
    }

    @Test
    public void getQueryTest(){
        assertEquals( "ML38SY", queryDtos.get(0).getQuery());
    }
}