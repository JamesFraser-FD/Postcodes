package ObjectMapping;


import ObjectMapping.DataTransfer.RequestDto;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Deserialiser<T extends RequestDto> {


    private final ObjectMapper mapper = new ObjectMapper();
    private final Class<T> type;

    public Deserialiser(Class<T> type) {
        this.type = type;
    }

    public T postcodeRequestData(File jsonFileLocation) {
        try {
            return mapper.readValue(jsonFileLocation, this.type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public T postcodeRequestData(String jsonString) {
        try {
            return mapper.readValue(jsonString, this.type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
