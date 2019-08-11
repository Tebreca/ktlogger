package com.tebreca.ktlogger;

public interface Logger {

    void log(Object obj, Level level);

    default void info(Object obj){
        log(obj, Level.INFO);
    }
    default void debug(Object obj){
        log(obj, Level.DEBUG);
    }
    default void warning(Object obj){
        log(obj, Level.WARNING);
    }
    default void error(Object obj){
        log(obj, Level.ERROR);
    }
    default void catching(Throwable obj){
        log(obj, Level.CATCHING);
    }

}
