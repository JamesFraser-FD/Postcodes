package ObjectMapping.Deserialise;


import ObjectMapping.DataTransfer.GeoPostcodeRequestDto;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class GeoLookupPostcodesDeserialiser {
    private final ObjectMapper mapper = new ObjectMapper();

    public GeoPostcodeRequestDto postcodeRequestData(File jsonFileLocation) {
        try {
            return mapper.readValue(jsonFileLocation, GeoPostcodeRequestDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public GeoPostcodeRequestDto postcodeRequestData(String jsonString) {
        try {
            return mapper.readValue(jsonString, GeoPostcodeRequestDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
