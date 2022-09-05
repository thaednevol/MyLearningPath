package knry.co.controller;

import co.knry.entity.Video;
import knry.co.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/videos")
@RequiredArgsConstructor
public class VideoController {

    private final VideoService videoservice;

    @GetMapping()
    public ResponseEntity<List<Video>> getAllvideos() {

        return new ResponseEntity<>(videoservice.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Video> getvideoById(@PathVariable("id") String id) {

        return new ResponseEntity<>(videoservice.findById(UUID.fromString(id)), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Video> createvideo(@RequestBody Video video) {

        return new ResponseEntity<>(videoservice.saveVideo(video), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Video> updatevideo(@PathVariable("id") String id, @RequestBody Video video) {

        if (videoservice.existById(UUID.fromString(id))) {
            return new ResponseEntity<>(videoservice.saveVideo(video), HttpStatus.ACCEPTED);
        }

        throw new IllegalArgumentException("video with id " + id + "not found");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deletevideo(@PathVariable("id") String id) {

        videoservice.deleteVideo(UUID.fromString(id));

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
