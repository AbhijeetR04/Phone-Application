public class Landline implements Phone{
    private int myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public Landline(int phoneNo) {
        this.myPhoneNo = phoneNo;
        this.isRinging = false;
        this.isPowerOn = true;
    }

    public int getPhoneNo() {
        return myPhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.myPhoneNo = phoneNo;
    }

    public boolean isRinging() {
        return isRinging;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }
    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

    @Override
    public void callNumber(int phoneNo) {
        if(isPowerOn){
            System.out.println("Hey " + myPhoneNo + " you are calling " + phoneNo);
        }
        else
            System.out.println("Landline is off");

        return;
    }

    @Override
    public void receiveCall(int calledNumber) {
        if(isPowerOn && myPhoneNo == calledNumber){
            isRinging = true;
            System.out.println("Hey " + myPhoneNo + " you are recieving call");
        }
        else
            System.out.println("Call not received.");

        return;

    }

    @Override
    public boolean answerCall() {
        if(isRinging){
            System.out.println("Call answered");
            isRinging = false;
            return true;
        }
        return false;
    }
}
