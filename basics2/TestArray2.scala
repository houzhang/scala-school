def fillArray(arr:Array[Int], v:Int, i:Int): Unit = {
  if(i < arr.length) {
    arr(i) = v
    fillArray(arr, v, i+1)
  }
}

var nums = Array(1,1,1,1,1)
fillArray(nums, 9, 0)
println(nums.toList)

def operateOnArray(arr:Array[Int], i:Int, f:(Int,Int) => Int):Int = {
  if(i < arr.length-1) {
    f(arr(i), operateOnArray(arr, i+1, f))
  } else {
    arr(i)
  }
}

var nums1 = Array(1,2,3,4,5)
println(operateOnArray(nums1, 0, _+_))

