package com.code.base.ctrstatement

fun main(args: Array<String>) {
	// 定义标签
	loop@ for (i in 1..4) {
		for (j in 1..4) {
			if (i == 2 && j == 2) {
				// break到指定标签
				break@loop
			}
			println("i = $i, j = $j")
		}
	}
}