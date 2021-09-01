import HttpManagement.PostcodesHttpManager;

public class Main {

    public static void main(String[] args) {
        PostcodesHttpManager httpManager = new PostcodesHttpManager("ML38SY");
        httpManager.makeUrlCall();
        System.out.println(httpManager.getResponseBody());
    }

}
