package spittr.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class SpittleRepositoryStub implements SpittleRepository {
    private final List<Spittle> stubbedSpittleList;

    public SpittleRepositoryStub() {
        stubbedSpittleList = new ArrayList<>();
        stubbedSpittleList.add(new Spittle("Hey! This is a first spittle", new Date()));
        stubbedSpittleList.add(new Spittle("And this is a second one!", new Date()));
        stubbedSpittleList.add(new Spittle("Here we have an example with the place coordinates", new Date(),
                35.83125, 48.81271));
        stubbedSpittleList.add(new Spittle("Trying to test count parameter. No luck. Impression is that parameter" +
                "is fully ignored. Or this SpittleRepositoryStub is not used at all... Investigating", new Date()));

    }

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        log.info("Looking for spittles: max {}, count {}", max, count);
        List<Spittle> list = stubbedSpittleList.stream()
                .limit(count)
                .collect(Collectors.toList());
        log.info("Found {} spittles", list.size());
        return list;
    }
}
