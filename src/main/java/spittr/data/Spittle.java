package spittr.data;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Date;

@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Spittle {
    @EqualsAndHashCode.Include
    private final Long id;
    @EqualsAndHashCode.Include
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longitude;

    public Spittle(String message, Date time) {
        this(message, time, 0.0, 0.0);
    }

    public Spittle(String message, Date time, Double longitude, Double latitude) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
