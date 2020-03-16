import lombok.*;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Weapon {

    private String name;
    private Damage damage;

}
