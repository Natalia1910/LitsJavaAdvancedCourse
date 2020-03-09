package com.homeworkOne;

public class MyThread implements Runnable {

    Thread thread;
    TickTock tickTock;


    MyThread(String name, TickTock tt) {
        thread = new Thread(this,name);
        tickTock = tt;
    }

    @Override
    public void run() {
        if (thread.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++){
                tickTock.tick(true);
                tickTock.tock(false);
            }
        } else {
            for (int i = 0; i < 5; i++) {
                tickTock.tock(true);
                tickTock.tick(false);
            }
        }
    }
}
