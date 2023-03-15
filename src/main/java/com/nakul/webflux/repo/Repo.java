package com.nakul.webflux.repo;
import com.nakul.webflux.domain.Anime;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface Repo extends ReactiveCrudRepository<Anime, Integer> {

    Mono<Anime> findById(int id);
}