package knry.co.service;

import co.knry.entity.Video;
import co.knry.repository.VideoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@AllArgsConstructor
@Service
public class VideoService {

    private final VideoRepository videoRepository;

    public List<Video> findAll() {

        return videoRepository.findAll();
    }

    public Video findById(UUID uuid) {
        return videoRepository.findById(uuid).orElseThrow(() -> new NoSuchElementException());
    }

    public Video saveVideo(Video video) {
        return videoRepository.save(video);
    }

    public void deleteVideo(UUID uuid) {

        videoRepository.deleteById(uuid);
    }

    public Video updateVideo(Video video) {
        return videoRepository.save(video);
    }

    public boolean existById(UUID uuid) {
        return videoRepository.existsById(uuid);
    }
}
