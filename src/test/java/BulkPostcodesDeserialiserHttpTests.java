import HttpManagement.BulkPostcodesHttpManager;
import ObjectMapping.DataTransfer.BulkPostcodeRequestDto;
import ObjectMapping.DataTransfer.PostcodeDto;
import ObjectMapping.DataTransfer.QueryDto;
import ObjectMapping.Deserialise.BulkPostcodesDeserialiser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BulkPostcodesDeserialiserHttpTests {
    private static BulkPostcodeRequestDto bulkPostcodeRequestDto;
    private static List<QueryDto> queryDtos;

    @BeforeAll
    private static void setup(){
        BulkPostcodesHttpManager bulkPostcodesHttpManager = new BulkPostcodesHttpManager(new String[] {"ML38SY", "ML92TN"});
        bulkPostcodesHttpManager.makeUrlCall();
        bulkPostcodeRequestDto = new BulkPostcodesDeserialiser().postcodeRequestData(bulkPostcodesHttpManager.getResponseBody());
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

    @Test
    public void getQueryResultTest(){
        assertEquals( PostcodeDto.class, queryDtos.get(0).getResult().getClass());
    }

}