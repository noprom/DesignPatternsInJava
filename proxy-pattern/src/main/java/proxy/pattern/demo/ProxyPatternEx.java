package proxy.pattern.demo;

import proxy.pattern.proxyclasses.Proxy;

/**
 * ProxyPatternEx
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/9/16 9:05 AM.
 */
public class ProxyPatternEx {

    public static void main(String[] args) {
        System.out.println("***Proxy Pattern Demo***\n");
        Proxy proxy = new Proxy();
        proxy.doSomeWord();
    }
}
