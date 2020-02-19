package pl.milosz.springbootspotify.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.milosz.springbootspotify.entity.Track;

@Repository
public interface TrackRepo extends MongoRepository<Track, String> {
}
