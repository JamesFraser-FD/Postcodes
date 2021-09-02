package ObjectMapping.Deserialise;


import ObjectMapping.DataTransfer.BulkPostcodeRequestDto;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class BulkPostcodesDeserialiser {
    private final ObjectMapper mapper = new ObjectMapper();

    public BulkPostcodeRequestDto postcodeRequestData(File jsonFileLocation) {
        try {
            return mapper.readValue(jsonFileLocation, BulkPostcodeRequestDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public BulkPostcodeRequestDto postcodeRequestData(String jsonString) {
        try {
            return mapper.readValue(jsonString, BulkPostcodeRequestDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
