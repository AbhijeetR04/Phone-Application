public class Main {
    public static void main(String[] args) {
        Landline l1 = new Landline(1234);
        Landline l2 = new Landline(2345);

        l1.callNumber(2345);
        l2.receiveCall(2345);
        System.out.println(l2.answerCall());
    }


}
