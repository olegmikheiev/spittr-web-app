package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.data.Spittle;
import spittr.data.SpittleRepository;

import java.util.List;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private static final String MAX_LONG_AS_STRING = "9223372036854775807"; // Long.toString(Long.MAX_VALUE);

    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @GetMapping
    public List<Spittle> spittles(
            @RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING) long max,
            @RequestParam(value = "count", defaultValue = "20") int count) {
        return spittleRepository.findSpittles(max, count);
    }
}
