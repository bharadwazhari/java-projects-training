import org.springframework.beans.factory.annotation.Autowired;

public class TV {

    @Autowired
    //association or dependency injection thru private & autowired
    private Remote remote;

    //association or dependency injection thru constructor
    public TV(Remote remote) {
        this.remote = remote;
    }

    public void diplay() {
        System.out.println("TV is ON"+remote.button());
    }

    //association or dependency injection thru method
    public void display(Remote remote) {
        System.out.println("TV is ON"+remote.button());
    }
}
