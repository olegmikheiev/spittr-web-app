package spittr.data;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class SpittleRepositoryStub implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittleList = new ArrayList<>();
        spittleList.add(new Spittle("Hey! This is a first spittle", new Date()));
        spittleList.add(new Spittle("And this is a second one!", new Date()));
        spittleList.add(new Spittle("Here we have an example with the place coordinates", new Date(),
                35.83125, 48.81271));
        return spittleList;
    }
}
