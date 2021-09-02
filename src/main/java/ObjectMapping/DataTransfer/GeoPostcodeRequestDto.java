package ObjectMapping.DataTransfer;


import java.util.List;

public class GeoPostcodeRequestDto {
    private int status;
    private List<GeoPostcodeDto> result;

    public int getStatus() {
        return status;
    }

    public List<GeoPostcodeDto> getResult() {
        return result;
    }
}
