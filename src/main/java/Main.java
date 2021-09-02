import HttpManagement.BulkPostcodesHttpManager;
import HttpManagement.GeoLookupPostcodesHttpManager;
import HttpManagement.PostcodesHttpManager;

public class Main {

    public static void main(String[] args) {
//        PostcodesHttpManager httpManager = new PostcodesHttpManager("ML38SY");
//        httpManager.makeUrlCall();
//        System.out.println(httpManager.getResponseBody());

//        String[] postcodes = {"ML38SY", "ML92TN"};
//        BulkPostcodesHttpManager httpManager = new BulkPostcodesHttpManager(postcodes);
//        httpManager.makeUrlCall();
//        System.out.println(httpManager.getResponseBody());

        GeoLookupPostcodesHttpManager httpManager = new GeoLookupPostcodesHttpManager(55.756359, -4.072492);
        httpManager.makeUrlCall();
        System.out.println(httpManager.getResponseBody());
    }

}
