fun main() {
    var rectangle1=rectangle(2.0,5.0)
    println(rectangle1.getarea())
    println(rectangle1.getperimeter())

    var rectangle2=rectanglebox(2.0,10.0,2.0)
    println(rectangle2.getarea())
}

interface ifigure {
    fun getperimeter():Double
    fun getarea():Double

}

open class rectangle(protected var width:Double, protected var length:Double) : ifigure {
    override fun getperimeter(): Double {
        return 2 * (width + length)
    }

    override fun getarea(): Double {
        return width * length
    }
}
class rectanglebox(width:Double, length:Double, private var height:Double):rectangle(width, length){
    override fun getarea(): Double {
        return super.getarea()*height
    }
}
class circle(protected var radius:Double):ifigure{
    override fun getarea(): Double {
        return 2*Math.PI*radius
    }

    override fun getperimeter(): Double {
        return Math.PI*radius*radius
    }
}