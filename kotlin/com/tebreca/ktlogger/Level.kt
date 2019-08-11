package com.tebreca.ktlogger

@SuppressWarnings("unused")
class Level(var text: String) {

    override fun toString(): String {
        return text;
    }

    companion object {
        @JvmField
        val INFO = Level("INFO")
        @JvmField
        val DEBUG = Level("DEBUG")
        @JvmField
        val WARNING = Level("WARNING")
        @JvmField
        val ERROR = Level("ERROR")
        @JvmField
        val CATCHING = Level("CATCHING")
    }

}