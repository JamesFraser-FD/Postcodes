package ObjectMapping;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class PostcodesDeserialiser {
    private ObjectMapper mapper = new ObjectMapper();

    public PostcodeRequestDto postcodeRequestData(File jsonFileLocation) {
        try {
            return mapper.readValue(jsonFileLocation, PostcodeRequestDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public PostcodeRequestDto postcodeRequestData(String jsonString) {
        try {
            return mapper.readValue(jsonString, PostcodeRequestDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
