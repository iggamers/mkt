package com.code.datastructures.sort

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntArrayData
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
	var array = arrayOf(5,4,3,2,1)
	var a = array.toIntArray()
	bubbleSort(a)
	println(a.contentToString())
	
	// 测试一下冒泡排序的速度O(n^2), 给80000个数据，测试
	// 创建要给80000个的随机的数组
	var arr = IntArray(80000)
	for (i in 0 until 80000){
		arr[i] = (0..800000).random()
	}
	val elapsedTime = measureTimeMillis {
		bubbleSort(arr)
	}
	println("total time :$elapsedTime")
	
	println("-----------")
	// bubbleSortEvolutionProcess()
}

fun bubbleSort(array: IntArray ):IntArray{
	// 冒泡排序的时间复杂度 O(n^2)
	// 临时变量
	var tmp:Int = 0
	// 标识变量，表示是否进行过交换
	var flag:Boolean = false
	for(i in 0 until array.size-1){
		for(j in 0 until  array.size -1 -i){
			// 如果前面的数比后面的数大，则交换
			if(array[j] > array[j+1]){
				flag = true
				tmp = array[j]
				array[j]= array[j+1]
				array[j+1] =tmp
			}
		}
		if(!flag){
			// 在一趟排序中，一次交换都没法生过
			break
		}else{
			// 重置flag,进行下次判断
			flag = false
		}
	}
	
	return  array
}

// 为了容量理解，我们把冒泡排序的演变过程，给大家展示
fun bubbleSortEvolutionProcess(){
	var arr = arrayOf(3,9,2,10,0)
	
	println("排序前")
	println(arr.contentToString())
	
	// 临时变量
	var tmp:Int = 0
	print("排序")
	// 第一次排序 就是将第一大的数排在倒数第1位
	for(j in 0 until  arr.size -1 ){
		// 如果前面的数比后面的数大，则交换
		if(arr[j] > arr[j+1]){
			tmp = arr[j]
			arr[j]= arr[j+1]
			arr[j+1] =tmp
		}
	}
	println(arr.contentToString())
	print("排序")
	// 第二次排序 就是将第二大的数排在倒数第二位
	for(j in 0 until  arr.size -1 -1){
		// 如果前面的数比后面的数大，则交换
		if(arr[j] > arr[j+1]){
			tmp = arr[j]
			arr[j]= arr[j+1]
			arr[j+1] =tmp
		}
	}
	println(arr.contentToString())
	print("排序")
	// 第三次排序 就是将第三大的数排在倒数第三位
	for(j in 0 until  arr.size -1 -1 -1){
		// 如果前面的数比后面的数大，则交换
		if(arr[j] > arr[j+1]){
			tmp = arr[j]
			arr[j]= arr[j+1]
			arr[j+1] =tmp
		}
	}
	println(arr.contentToString())
	
	// 第四趟排序，就是将第4大的数排在倒数第4位
	print("排序")
	for(j in 0 until  arr.size -1 -1 -1-1){
		// 如果前面的数比后面的数大，则交换
		if(arr[j] > arr[j+1]){
			tmp = arr[j]
			arr[j]= arr[j+1]
			arr[j+1] =tmp
		}
	}
	println(arr.contentToString())
}