import HttpManagement.BulkPostcodesHttpManager;
import HttpManagement.PostcodesHttpManager;

public class Main {

    public static void main(String[] args) {
//        PostcodesHttpManager httpManager = new PostcodesHttpManager("ML38SY");
//        httpManager.makeUrlCall();
//        System.out.println(httpManager.getResponseBody());

        String[] postcodes = {"ML38SY", "ML92TN"};
        BulkPostcodesHttpManager httpManager = new BulkPostcodesHttpManager(postcodes);
        httpManager.makeUrlCall();
        System.out.println(httpManager.getResponseBody());
    }

}
