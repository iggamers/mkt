package com.code.datastructures.sort

fun main(args: Array<String>) {
	var arr = arrayOf(101, 34, 119, 1).toIntArray()
	println("排序前：")
	println(arr.contentToString())
	radixSort(arr)
	
	print("排序后：")
	println(arr.contentToString())
}

fun radixSort(arr: IntArray) {
	// 1.得到数组中最大的数的位数
	var max = arr[0]
	arr.forEach {
		if (it > max)
			max = it
	}
	// 得到最大数是几位数
	var maxLength = max.toString().length
	
	// 定义一个二维数组，表示10个桶, 每个桶就是一个一维数组
	// 说明
	// 1. 二维数组包含10个一维数组
	// 2. 为了防止在放入数的时候，数据溢出，则每个一维数组(桶)，大小定为arr.size
	// 3. 名明确，基数排序是使用空间换时间的经典算法
	var bucket = Array(10){IntArray(arr.size)}
	
	// 为了记录每个桶中，实际存放了多少个数据,我们定义一个一维数组来记录各个桶的每次放入的数据个数
	// 可以这里理解
	// 比如：bucketElementCounts[0] , 记录的就是  bucket[0] 桶的放入数据个数
	var bucketElementCounts = IntArray(10)
	
	// 这里我们使用循环将代码处理
	var n = 1
	for(i in 0 until  maxLength){
		//(针对每个元素的对应位进行排序处理)， 第一次是个位，第二次是十位，第三次是百位..
		arr.forEach {
			// 去除每个元素对应位的值
			val digitOfElement = it / n % 10
			// 放入对应的桶中
			bucket[digitOfElement][bucketElementCounts[digitOfElement]] = it
			bucketElementCounts[digitOfElement]++
		}
		
		// 按照这个桶的顺序(一维数组的下标依次取出数据，放入原来数组)
		var index = 0
		for ((k, v) in bucketElementCounts.withIndex()) {
			// 如果桶中，有数据，我们才放入到原数组
			if (v != 0) {
				// 循环该桶即第k个桶(即第k个一维数组), 放入
				for (l in 0 until v) {
					arr[index++] = bucket[k][l]
				}
			}
			//第i+1轮处理后，需要将每个 bucketElementCounts[k] = 0 ！！！！
			bucketElementCounts[k] = 0
		}
		
		n *= 10
	}
}

fun radixSortEvolutionProcess(){
	var arr = arrayOf(101, 34, 119, 1).toIntArray()
	println("排序前：")
	println(arr.contentToString())
	
	
	print("第1轮：")
	// 第1轮 (针对每个元素的个位进行排序处理)
	println(arr.contentToString())
	// ...
}