public interface Phone {
    void powerOn();
    void callNumber(int phoneNo);
    void receiveCall(int myNumber);
    boolean answerCall();
    boolean isRinging();

}
