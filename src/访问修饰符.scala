/*
scala中访问修饰符有三种：private，protected,public
如果没有指定访问修饰符的情况下，Scala对象的访问级别都是public
* */
object hello {
    def main(args: Array[String]): Unit = {
        var tmp = 4
        if(tmp>3){
            print("OK!")
        }else{
            print("Not OK!")
        }
    }
}