package atm;


public abstract class DefaultTray implements Tray {
    private Tray nextTray;
    private final int BILL;

    public DefaultTray(int bill) {
        BILL = bill;
    }

    public void process(int amount) {
        int num = amount / BILL;
        if (nextTray != null) {
            nextTray.process(amount - num* BILL);
        }
        else {
            if (amount - num* BILL != 0) {
                throw new IllegalArgumentException("Cannot be processed!!");
            }
        }
        System.out.println("Get" + num + " with amount of " + BILL);
    }
    public void setNext(Tray tray) {
        this.nextTray = tray;
    }
}