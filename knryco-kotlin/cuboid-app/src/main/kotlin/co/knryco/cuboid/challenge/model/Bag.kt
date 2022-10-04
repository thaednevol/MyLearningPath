package co.knryco.cuboid.challenge.model

import lombok.*
import javax.persistence.*

/**
 * Entity representing Bags table
 *
 * @author FullStack Labs
 * @version 1.0
 * @since 2021-10-22
 */
@Entity
@Table(name = "BAGS")
@Getter
@Setter
@NoArgsConstructor
class Bag(title: String?, volume: Double) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long? = null

    @Column(name = "VOLUME", nullable = false)
    private val volume = 0.0

    @Column(name = "TITLE", nullable = false, length = TITLE_MAX_SIZE)
    private val title: String? = null

    @OneToMany(cascade = [CascadeType.ALL], orphanRemoval = true, mappedBy = "bag")
    @Setter(AccessLevel.PRIVATE)
    private val cuboids: MutableList<Cuboid> = ArrayList()

    @Transient
    var payloadVolume: Double? = null
        get() {
            field = 0.0
            cuboids.stream().forEach { cuboid: Cuboid -> field += cuboid.volume }
            return field
        }
        private set

    @Transient
    val availableVolume: Double?
        get() = volume - payloadVolume!!

    init {
        this.setVolume(volume)
        this.setTitle(title)
    }

    /**
     * Returns an unmodifiable List containing the cuboids elements.
     *
     * @return List<Cuboid>
    </Cuboid> */
    fun getCuboids(): List<Cuboid> {
        return java.util.List.copyOf(cuboids)
    }

    fun addCuboid(cuboid: Cuboid) {
        cuboids.add(cuboid)
    }

    companion object {
        const val TITLE_MAX_SIZE = 100
    }
}