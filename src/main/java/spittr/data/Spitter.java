package spittr.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class Spitter {
    private Long id;

    @NotNull
    @Size(min = 5, max = 256)
    @EqualsAndHashCode.Include
    private String username;

    @NotNull
    @Size(min = 4, max = 32)
    private String password;

    @NotNull
    @Size(min = 1, max = 256)
    private String firstName;

    @NotNull
    @Size(min = 1, max = 256)
    private String lastName;

    public Spitter(String username, String password, String firstName, String lastName) {
        this(null, username, password, firstName, lastName);
    }

    public static Spitter createCopyOf(Spitter spitter) {
        return new Spitter(spitter.username, spitter.password, spitter.firstName, spitter.lastName);
    }
}
