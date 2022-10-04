package co.knryco.cuboid.challenge.model

import lombok.Getter
import lombok.Setter
import javax.persistence.*

/**
 * Entity representing Cuboids table
 *
 * @author FullStack Labs
 * @version 1.0
 * @since 2021-10-22
 */
@Entity
@Table(name = "CUBOIDS")
@Getter
@Setter
class Cuboid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long? = null

    @Column(name = "WIDTH", nullable = false)
    private val width = 0f

    @Column(name = "HEIGHT", nullable = false)
    private val height = 0f

    @Column(name = "DEPTH", nullable = false)
    private val depth = 0f

    @ManyToOne
    @JoinColumn(name = "BAG_ID", nullable = false)
    private val bag: Bag? = null

    val volume: Double?
        get() = (width * height * depth).toDouble()
}