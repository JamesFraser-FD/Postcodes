import ConfigManagement.ConfigManager;
import ObjectMapping.PostcodeDto;
import ObjectMapping.PostcodeRequestDto;
import ObjectMapping.PostcodesDeserialiser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class PostcodesDeserialiserTests {
    private static PostcodeRequestDto postcodeRequestDto;
    private static PostcodeDto postcodeDto;

    @BeforeAll
    private static void setup(){
        postcodeRequestDto = new PostcodesDeserialiser().postcodeRequestData(new File(ConfigManager.postcodeTestFileLocation()));
        postcodeDto = postcodeRequestDto.getResult();
    }

    @Test
    public void getSuccessTest(){
        assertEquals( 200, postcodeRequestDto.getStatus());
    }


}