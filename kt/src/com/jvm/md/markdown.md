我展示的是一级标题
===============

我展示的是二级标题
-----------------

# 一级标题
## 二级标题
### 三级标题
#### 四级标题
##### 五级标题
###### 六级标题

###Markdown 可以使用以下几种字体：
####Markdown 段落没有特殊的格式，直接编写文字就好，段落的换行是使用两个以上空格加上回车。
*斜体文本*  
_斜体文本_  
**粗体文本**  
__粗体文本__  
***粗斜体文本***  
___粗斜体文本___

###你可以在一行中用三个以上的星号、减号、底线来建立一个分隔线，行内不能有其他东西。你也可以在星号或是减号中间插入空格。下面每种写法都可以建立分隔线：
***

* * *

*****

- - -

----------

###删除线  如果段落上的文字要添加删除线，只需要在文字的两端加上两个波浪线 ~~ 即可，实例如下：
爱你中国

~~爱你中国~~


###下划线 下划线可以通过 HTML 的 <u> 标签来实现：
<u>带下划线文本</u>

###脚注  脚注是对文本的补充说明。
   创建脚注格式类似这样子[^abc]   

###无序列表使用星号(*)、加号(+)或是减号(-)作为列表标记，这些标记后面要添加一个空格，然后再填写内容：
* 第一项
* 第二项

+ 第一项
+ 第二项

- 第一项
- 第二项

###有序列表使用数字并加上 . 号来表示，如：
1. 第一项
2. 第二项
3. 第三项

###列表嵌套只需在子列表中的选项前面添加四个空格即可
1. 第一项：
    - 第一项嵌套的第一个元素
    - 第一项嵌套的第二个元素
2. 第二项：
    - 第二项嵌套的第一个元素
    - 第二项嵌套的第二个元素

###Markdown 区块引用是在段落开头使用 > 符号 ，然后后面紧跟一个空格符号：
> 最外层  
> 最外层
> > 第一层嵌套  
> > > 第二层嵌套

> 区块中使用列表
> 1. 第一项
> 2. 第二项
> + 第一项
> + 第二项
> + 第三项

###列表中使用区块   如果要在列表项目内放进区块，那么就需要在 > 前添加四个空格的缩进。
* 第一项
  > 菜鸟教程
  > 学的不仅是技术更是梦想
* 第二项

###如果是段落上的一个函数或片段的代码可以用反引号把它包起来（`），例如：
`printf()` 函数

###代码区块使用 4 个空格或者一个制表符（Tab 键）
    #include<stdio.h>
    int main()
    {
       printf("hello world");
    }
###你也可以用 ``` 包裹一段代码，并指定一种语言（也可以不指定）：
  ```cpp
    #include"iostream"
    int mian()
    {
        std::cout<<"abc"<<endl;
    }
  ```

###链接地址使用方法
这是一个地址<https://www.baidu.com>
这是一个链接 [百度](https://www.baidu.com)

####我们可以通过变量来设置一个链接，变量赋值在文档末尾进行：

这个链接用 1 作为网址变量 [Google][1]
这个链接用 百度 作为网址变量 [百度][百度]
然后在文档的结尾为变量赋值（网址）

[1]: http://www.google.com/
[百度]: https://www.baidu.com

### Markdown 制作表格使用 | 来分隔不同的单元格，使用 - 来分隔表头和其他行。
|  表头   | 表头  |
|  ----  | ----  |
| 单元格  | 单元格 |
| 单元格  | 单元格 |

###对齐方式 我们可以设置表格的对齐方式：

* -: 设置内容和标题栏居右对齐。 
* :-: 设置内容和标题栏居左对齐。
* :- 设置内容和标题栏居中对齐。  

| 左对齐 | 右对齐 | 居中对齐 |
| :-----| ----: | :----: |
| 单元格 | 单元格 | 单元格 |
| 单元格 | 单元格 | 单元格 |


#### 图片
+ 开头一个感叹号 !  
+ 接着一个方括号，里面放上图片的替代文字  
+ 接着一个普通括号，里面放上图片的网址或者相对路径，最后还可以用引号包住并加上选择性的 'title' 属性的文字。  
  <img src="1.png" width="30%">
![ 月夜星空 ](1.png)











































