package spittr.data;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Date;

@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
public class Spittle {
    @EqualsAndHashCode.Include
    private final Long id;
    @EqualsAndHashCode.Include
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longitude;

    public Spittle(String message, Date time) {
        this(null, message, time);
    }

    public Spittle(Long id, String message, Date time) {
        this(id, message, time, 0.0, 0.0);
    }

    public Spittle(String message, Date time, Double longitude, Double latitude) {
        this(null, message, time, longitude, latitude);
    }
}
