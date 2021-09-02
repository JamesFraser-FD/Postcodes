package ObjectMapping.DataTransfer;


import java.util.List;

public class GeoPostcodeRequestDto extends RequestDto {
    private List<GeoPostcodeDto> result;

    public List<GeoPostcodeDto> getResult() {
        return result;
    }
}
