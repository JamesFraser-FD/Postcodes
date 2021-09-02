package ObjectMapping.DataTransfer;


import java.util.List;

public class BulkPostcodeRequestDto {
    private int status;
    private List<QueryDto> result;

    public int getStatus() {
        return status;
    }

    public List<QueryDto> getResult() {
        return result;
    }
}
