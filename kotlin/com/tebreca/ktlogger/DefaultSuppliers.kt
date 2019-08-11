package com.tebreca.ktlogger

import java.util.*
import java.util.function.Supplier

class DefaultSuppliers {

    companion object{
        @JvmField val DATETIME : Supplier<String> = Supplier{ Calendar.getInstance().time.toString() }
        @JvmField val CLASSNAME : Supplier<String> = Supplier{
            var trace =Thread.currentThread().stackTrace
            var currentTrace = trace[trace.size-1]
            return@Supplier "${currentTrace.className}#${currentTrace.methodName}:${currentTrace.lineNumber}"
        }
        @JvmStatic fun OBJECT(obj: Any) : Supplier<String> = Supplier{ obj.toString()}
    }

}