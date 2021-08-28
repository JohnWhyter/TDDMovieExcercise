package uk.sky.ovp.interview;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;

class MovieDatabaseTest {
    private final MovieDatabase movieDatabase = null;

    @Test
    void findByNameWorksInAbsentScenario() {
        Optional<Movie> movie = movieDatabase.findByTitle("Matrix 4");

        assertFalse(movie.isPresent());
    }
}
