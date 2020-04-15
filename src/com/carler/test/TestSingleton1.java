package com.carler.test;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

import com.carler.main.Singleton4;

public class TestSingleton1 {


    Callable<Singleton4> c = () -> Singleton4.getInstance();



}
