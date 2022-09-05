package co.knry.repository;

import co.knry.entity.Video;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface VideoRepository extends CassandraRepository<Video, UUID> {
    List<Video> findByTitle(String title);
}