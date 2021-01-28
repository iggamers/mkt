package com.code.datastructures.sort

import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
	// 创建要给80000个的随机的数组
	var arr = IntArray(80000)
	for (i in 0 until 80000){
		arr[i] = (0..800000).random()
	}
	val elapsedTime = measureTimeMillis {
		selectSort(arr)
	}
	println("total time :$elapsedTime")
	
	arr = arrayOf(101, 34, 119, 1).toIntArray()
	println("排序前：")
	println(arr.contentToString())
	selectSort(arr)
	println("排序后：")
	println(arr.contentToString())
	
	println("---------------")
	selectSortEvolutionProcess()
}

fun selectSort(arr :IntArray){
	for (i in arr.indices){
		var minIndex = i;
		var  min = arr[i];
		for(j in i+1 until  arr.size ){
			if (min > arr[j]) { //说明假定的最小值，并不是最小
				min = arr[j]; //重置min
				minIndex = j; //重置minIndex
			}
		}
		//将最小值，放在arr[0], 即交换
		if(minIndex != i) {
			arr[minIndex] = arr[i];
			arr[i] = min;
		}
	}
}

// 使用逐步推导的方式来讲解，便于理解
fun selectSortEvolutionProcess(){
	var arr = arrayOf(101, 34, 119, 1).toIntArray()
	println("排序前：")
	println(arr.contentToString())
	
	//第1轮
	//原始的数组 ： 	101, 34, 119, 1
	//第一轮排序 :   	1, 34, 119, 101
	//算法 先简单--》 做复杂， 就是可以把一个复杂的算法，拆分成简单的问题-》逐步解决
	
	//第1轮
	var minIndex = 0;
	var  min = arr[0];
	for(j in arr.indices) {
		if (min > arr[j]) { //说明假定的最小值，并不是最小
			min = arr[j]; //重置min
			minIndex = j; //重置minIndex
		}
	}
	//将最小值，放在arr[0], 即交换
	if(minIndex != 0) {
		arr[minIndex] = arr[0];
		arr[0] = min;
	}
	print("第1轮：")
	println(arr.contentToString())
	
	//第2轮
	minIndex = 1;
	min = arr[1];
	for(j in 1 until arr.size) {
		if (min > arr[j]) { //说明假定的最小值，并不是最小
			min = arr[j]; //重置min
			minIndex = j; //重置minIndex
		}
	}
	//将最小值，放在arr[0], 即交换
	if(minIndex != 1) {
		arr[minIndex] = arr[1];
		arr[1] = min;
	}
	print("第2轮：")
	println(arr.contentToString())
	
	
	//第3轮
	minIndex = 3;
	min = arr[2];
	for(j in 2 until arr.size) {
		if (min > arr[j]) { //说明假定的最小值，并不是最小
			min = arr[j]; //重置min
			minIndex = j; //重置minIndex
		}
	}
	//将最小值，放在arr[0], 即交换
	if(minIndex != 2) {
		arr[minIndex] = arr[2];
		arr[2] = min;
	}
	print("第3轮：")
	println(arr.contentToString())
}