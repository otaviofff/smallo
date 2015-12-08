package org.smallo.common;

import java.util.Date;

public class Timer {
    private long started = 0;
    private long stopped = 0;
    
    public void start() {
        stopped = 0;
        started = new Date().getTime();
    }
    
    public void stop() {
        stopped = new Date().getTime();
    }
    
    public long timeElapsed() {
        return stopped - started;
    }
}
