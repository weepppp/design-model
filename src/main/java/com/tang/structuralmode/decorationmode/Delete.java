package com.tang.structuralmode.decorationmode;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author weepppp 2022/7/13 11:50
 **/
public class Delete implements Runnable {

    private int ticket = 30;
    private final Lock lock = new ReentrantLock();

    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售出车票，售出车票号码为： " + ticket--);
                }
            } finally {
                lock.unlock();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        final Delete delete = new Delete();
        new Thread(delete, "1号窗口").start();
        new Thread(delete, "2号窗口").start();
        new Thread(delete, "3号窗口").start();
    }
}
