import org.springframework.beans.factory.annotation.Autowired;

public class TV {

    @Autowired
    //association or dependency injection thru private & autowired
    private Remote remote;

    private Remote r1;

    private Remote r2;

    //association or dependency injection thru constructor
    public TV(Remote r1) {
        this.r1 = r1;
    }

    public void diplay() {
        System.out.println("TV is ON"+remote.button());
    }

    //association or dependency injection thru method
    public void display(Remote remote) {
        System.out.println("TV is ON"+remote.button());
    }

    public Remote getRemote() {
        return remote;
    }

    public void setR2(Remote r2) {
        this.r2 = r2;
    }
}
