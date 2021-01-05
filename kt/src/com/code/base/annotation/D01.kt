package com.code.base.annotation

// 注解（annotation）
// meta-annotation（元注解）

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION,
		AnnotationTarget.CONSTRUCTOR, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.FIELD, AnnotationTarget.PROPERTY_GETTER)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class MyAnnotation


@MyAnnotation
class MyClass {
	
	@MyAnnotation
	fun myMethod(@MyAnnotation a: Int): Int {
		return (@MyAnnotation 10)
	}
}

// 给主构造方法添加注解的时候 constructor必须存在
class MyClass2 @MyAnnotation constructor(a: Int) {

}

class MyClass3 {
	var a: Int? = null
		@MyAnnotation set
}