package com.code.base

// 定义枚举
enum class D008EnumWeek {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

enum class D0081Season(val temperature: Int) {
    SPRING(10), SUMMER(30), AUTUMN(20), WINTER(-10)
}

// 枚举中声明方法
enum class D0082Season {

    SPRING {
        override fun getSeason(): D0082Season = SPRING
    },

    SUMMER {
        override fun getSeason(): D0082Season = SUMMER
    },

    AUTUMN {
        override fun getSeason(): D0082Season = AUTUMN
    },

    WINTER {
        override fun getSeason(): D0082Season = WINTER
    };

    abstract fun getSeason(): D0082Season
}



fun printInfo(c: D008EnumWeek): Unit {
    when (c) {
        D008EnumWeek.MON -> println("今天是 星期一")
        D008EnumWeek.TUE -> println("今天是 星期二")
        D008EnumWeek.WED -> println("今天是 星期三")
        D008EnumWeek.THU -> println("今天是 星期四")
        D008EnumWeek.FRI -> println("今天是 星期五")
        D008EnumWeek.SAT -> println("今天是 星期六")
        D008EnumWeek.SUN -> println("今天是 星期日")
    }
}

fun main(args: Array<String>) {
    printInfo(D008EnumWeek.MON)

    println("--------遍历集合--------")
    for (value in D008EnumWeek.values()) {
        println(value.name)
    }

    println(D008EnumWeek.MON.name)
    println(D008EnumWeek.MON.ordinal)
}

