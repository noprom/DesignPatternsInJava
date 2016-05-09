package proxy.pattern.staticproxy.demo;

import proxy.pattern.staticproxy.proxyclasses.Proxy;

/**
 * ProxyPatternEx
 * 客户端调用
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 5/9/16 9:05 AM.
 */
public class ProxyPatternEx {

    public static void main(String[] args) {
        System.out.println("***Proxy Pattern Demo***\n");
        Proxy proxy = new Proxy();
        proxy.doSomeWord();     //代理者代替真实者做事情
    }
}
