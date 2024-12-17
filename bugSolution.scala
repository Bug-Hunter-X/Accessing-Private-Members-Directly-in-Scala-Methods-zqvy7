```scala
class MyClass {
  private val myVar: Int = 10

  def getMyVar(): Int = myVar

  def myMethod(): Int = {
    getMyVar() + 1 // Improved method accessing myVar through an accessor
  }
}
```