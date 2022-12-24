package co.knryco

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val name = if (args.isNotEmpty()) args[0] else "Kotlin"
        println("Hello, ${args.getOrNull(0)}!")
        println("First ${foo()}, second ${foo()}")

        val list = mutableListOf("Java")
        list.add("kotlin")
    }

    fun foo(): String {
        println("Calculating foo...")
        return "foo"
    }


}