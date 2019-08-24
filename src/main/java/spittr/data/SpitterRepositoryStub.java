package spittr.data;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class SpitterRepositoryStub implements SpitterRepository {
    private long spitterId = 0L;
    private List<Spitter> spitters;

    public SpitterRepositoryStub() {
        spitters = new LinkedList<>();
    }

    @Override
    public Spitter save(Spitter spitter) {
        Spitter newSpitter = Spitter.createCopyOf(spitter);
        newSpitter.setId(spitterId++);
        spitters.add(newSpitter);
        return newSpitter;
    }

    public Spitter getSpitterBy(long id) {
        return spitters.stream()
                .filter(spitter -> id == spitter.getId())
                .findFirst()
                .orElse(null);
    }

    public Spitter getSpitterBy(String username) {
        return spitters.stream()
                .filter(spitter -> username.equalsIgnoreCase(spitter.getUsername()))
                .findFirst()
                .orElse(null);
    }
}
