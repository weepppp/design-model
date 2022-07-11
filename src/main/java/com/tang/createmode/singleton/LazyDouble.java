package com.tang.createmode.singleton;

/**
 * @author weepppp 2022/7/11 15:23
 **/

/**
 * @功能: 懒汉式改进
 * 原有懒汉式的不足：如果线程A进入了if，但是还没有创造实例结束，此时线程B也进入了if，也开始new lazy，就会产生两个实例，所有原有写法的懒汉式并不支持多线程访问
 * 用双重锁模式懒汉式改进原有写法
 */
public class LazyDouble {

    private static LazyDouble lazyDouble = null;

    public static LazyDouble getLazyDouble(){
        if (lazyDouble == null) {
            // 此时只会有一个线程拿到类锁，保证同时只有一个线程在创造实例，不会有其他线程打扰
            synchronized (LazyDouble.class){
                // 但是如果A线程顺利执行结束创建了实例，而此时B线程也完成了上面的判空拿到了锁，就又会创建实例，所以要进行第二次判空验证
                if (lazyDouble == null){
                    LazyDouble lazyDouble = new LazyDouble();
                }
            }
        }
        return lazyDouble;
    }

    // 但是上面的双重锁还存在一个问题：由于操作系统和jvm重排序，导致在第一个线程创建对象的过程由【1.创建一个空对象 2.给对象初始化值 3.改变局部变量表的指针指向这个对象】
    // 变成了【1.创建一个空对象 2.改变局部变量表的指针指向这个对象 3.给对象初始化值】，如果在第2步结束后，第一个线程恰好被堵塞了就只能释放锁
    // 此时lazyDouble == null是成立的，第二个线程拿锁进入
    // 最后的结果就是，第二个线程会直接返回第一个线程还没有进行初始化操作的那个空对象，就很离谱
    // 那要怎么改进呢？ 禁用重排序的方法—>volatile，当我们给对象加上volatile关键字时，程序会禁止代码重排序，从而保证了instance要么为null 要么是已经完全初始化好的对象
    // 改后代码： private static volatile LazyDouble lazyDouble = null;
}
