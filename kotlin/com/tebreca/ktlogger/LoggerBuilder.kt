package com.tebreca.ktlogger

import java.util.function.Supplier

class LoggerBuilder {

    private var name: String = ""

    private val suppliers: ArrayList<Supplier<String>> = ArrayList()

    companion object {
        @JvmStatic
        fun newInstance(name: String): LoggerBuilder {
            val builder = LoggerBuilder()
            return builder.setName(name);
        }
    }

    fun setName(name: String): LoggerBuilder {
        this.name = name;
        return this;
    }

    fun add(supplier: Supplier<String>): LoggerBuilder {
        suppliers.add(supplier)
        return this
    }

    fun build(): Logger = Logger { obj: Any, level: Level ->
        var s: String = ""
        for (supplier in suppliers) {
            s += "[${supplier.get()}]"
        }
        print("$s[$name][${level.toString()}]: ${if (obj is String) obj else obj.toString()}")
    }

}