package com.carler.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Caler_赵康乐
 * @create 2020-02-26 15:05
 * @description :
 */
public class DynReflect implements InvocationHandler {
    private Object object;
    private DynReflect(Object object){
        this.object=object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行前");
        method.invoke(object,args);
        System.out.println("方法执行后");
        return object;
    }

    public static void main(String[] args) {
        Person p = new Studenty();

        DynReflect reflect = new DynReflect(p);
        Person o = (Person)Proxy.newProxyInstance(DynReflect.class.getClassLoader(), p.getClass().getInterfaces(), reflect);
        o.say();
    }
}
