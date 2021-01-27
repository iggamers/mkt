package com.code.datastructures.sort

import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
	// 测试一下归并排序的速度O(n^2), 给80000个数据，测试
	// 创建要给80000个的随机的数组
	var arr = IntArray(80000)
	for (i in 0 until 80000) {
		arr[i] = (0..800000).random()
	}
	val elapsedTime = measureTimeMillis {
		// 归并排序需要一个额外空间
		val temp = IntArray(arr.size)
		mergeSort(arr, 0, arr.size - 1, temp)
	}
	println("total time :$elapsedTime")
	
	println("-----------")
	arr = arrayOf(101, 34, 119, 1).toIntArray()
	println("排序前：")
	println(arr.contentToString())
	val temp = IntArray(arr.size)
	mergeSort(arr, 0, arr.size - 1, temp)
	println("排序后：")
	println(arr.contentToString())
	
}

// 分+合方法
fun mergeSort(arr: IntArray, left: Int, right: Int, tmp: IntArray) {
	if (left < right) {
		val mid = (left + right) / 2 //中间索引
		//向左递归进行分解
		mergeSort(arr, left, mid, tmp)
		//向右递归进行分解
		mergeSort(arr, mid + 1, right, tmp)
		//合并
		merge(arr, left, mid, right, tmp)
	}
}

/***
 * @param arr 排序的原始数组
 * @param left 左边有序序列的初始索引
 * @param mid 中间索引
 * @param right 右边索引
 * @param tmp 做中转的数组
 */
fun merge(arr: IntArray, left: Int, mid: Int, right: Int, tmp: IntArray) {
	// 左边有序序列的初始索引
	var l = left
	// 右边有序序列的初始化索引
	var r = mid + 1
	// 指向tmp数组的当前索引
	var t = 0
	
	//(一)
	//先把左右两边(有序)的数据按照规则填充到tmp数组
	//直到左右两边的有序序列，有一边处理完毕为止
	while (l <= mid && r <= right) { //继续
		//如果左边的有序序列的当前元素，小于等于右边有序序列的当前元素
		//即将左边的当前元素，填充到 temp数组
		//然后 t++, i++
		if (arr[l] <= arr[r]) {
			tmp[t] = arr[l]
			t += 1
			l += 1
		} else { //反之,将右边有序序列的当前元素，填充到tmp数组
			tmp[t] = arr[r]
			t += 1
			r += 1
		}
	}
	
	//(二)
	//把有剩余数据的一边的数据依次全部填充到tmp
	while (l <= mid) {
		// 左边的有序序列还有剩余的元素，全部填充到tmp中
		tmp[t] = arr[l]
		t++
		l++
	}
	
	while (r <= right) {
		// 左边的有序序列还有剩余的元素，全部填充到tmp中
		tmp[t] = arr[r]
		t++
		r++
	}
	
	//(三)
	//将temp数组的元素拷贝到arr
	//注意，并不是每次都拷贝所有
	t = 0
	var tmpLeft = left
	//第一次合并 tempLeft = 0 , right = 1 //  tempLeft = 2  right = 3 // tL=0 ri=3
	//最后一次 tempLeft = 0  right = 7
	while (tmpLeft <= right) {
		arr[tmpLeft] = tmp[t]
		t += 1
		tmpLeft += 1
	}
}