package interface_adapter.clear_users;

// TODO: Complete me

import java.util.ArrayList;

public class ClearState {

    private String cleared = "";

    public ClearState(ClearState copy) {
        cleared = copy.cleared;
    }

    public ClearState() {}

    public String getCleared() {return cleared;}

    public void setCleared(String cleared) {
        this.cleared = cleared;
    }
}
