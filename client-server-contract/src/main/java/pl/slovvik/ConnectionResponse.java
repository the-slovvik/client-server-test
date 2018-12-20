package pl.slovvik;

import lombok.extern.java.Log;

import java.io.Serializable;
@Log
public class ConnectionResponse implements Serializable {

    private int status;
    private int message;

    public ConnectionResponse(int status, int message) {
        log.info("test");
        this.status = status;
        this.message = message;
    }
}
