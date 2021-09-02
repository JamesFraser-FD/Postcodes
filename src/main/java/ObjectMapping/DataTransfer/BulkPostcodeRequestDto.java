package ObjectMapping.DataTransfer;


import java.util.List;

public class BulkPostcodeRequestDto extends RequestDto {
    private List<QueryDto> result;

    public List<QueryDto> getResult() {
        return result;
    }
}
