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
	println("----------------")
	 arr = arrayOf(8, 9, 1, 7, 2, 3, 5, 4, 6, 0).toIntArray()
	println("排序前：")
	println(arr.contentToString())
	shellSort(arr)
	println("排序后：")
	println(arr.contentToString())
	println("----------------")
	
	shellSortEvolutionProcess()
	
}

// 希尔排序时， 对有序序列在插入时采用交换法,
fun shellSort(array: IntArray) {
	if (array.isEmpty()) {
		return
	}
	
	val size = array.size
	var gap = size / 2
	
	while (gap > 0) {
		for (i in gap until size step gap) {
			
			val temp = array[i]
			var j = i
			
			while (j > 0 && array[j - gap] > temp) {
				array[j] = array[j - gap]
				j -= gap
			}
			
			array[j] = temp
		}
		
		gap /= 2
	}
}

// 使用逐步推导的方式来讲解，便于理解
fun shellSortEvolutionProcess(){
	var arr = arrayOf(8, 9, 1, 7, 2, 3, 5, 4, 6, 0).toIntArray()
	println("排序前：")
	println(arr.contentToString())
	
	var tmp :Int = 0
	// 第一轮
	// 因为第1轮排序，是将10个数据分成了 5组
	for(i in 5 until  arr.size){
		// 遍历各组中所有的元素(共5组，每组有2个元素), 步长5
		for( j in i-5 downTo  0  step 5){
			// 如果当前元素大于加上步长后的那个元素，说明交换
			if (arr[j] > arr[j + 5]){
				tmp  = arr[j]
				arr[j] =arr[j + 5]
				arr[j + 5] = tmp
			}
		}
	}
	print("第1轮：")
	println(arr.contentToString())
	
	// 第二轮
	// 因为第2轮排序，是将10个数据分成了 5/2 = 2组
	for(i in 2 until  arr.size){
		// 遍历各组中所有的元素(共2组，每组有5个元素), 步长2
		for( j in i-2 downTo  0  step 2){
			// 如果当前元素大于加上步长后的那个元素，说明交换
			if (arr[j] > arr[j + 2]){
				tmp  = arr[j]
				arr[j] =arr[j + 2]
				arr[j + 2] = tmp
			}
		}
	}
	print("第2轮：")
	println(arr.contentToString())
	
	// 第三轮
	// 因为第3轮排序，是将10个数据分成了 2/2 = 1组
	for(i in 1 until  arr.size){
		// 遍历各组中所有的元素(共1组，每组有10个元素), 步长1
		for( j in i-1 downTo  0){
			// 如果当前元素大于加上步长后的那个元素，说明交换
			if (arr[j] > arr[j + 1]){
				tmp  = arr[j]
				arr[j] =arr[j + 1]
				arr[j + 1] = tmp
			}
		}
	}
	print("第3轮：")
	println(arr.contentToString())
	
}