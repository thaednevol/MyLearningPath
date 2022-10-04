package co.knryco.cuboid.challenge

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object CuboidChallengeApplication {
    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(CuboidChallengeApplication::class.java, *args)
    }
}