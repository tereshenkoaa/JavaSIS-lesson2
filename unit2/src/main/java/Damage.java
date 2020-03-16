import lombok.*;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Damage {

    private int physicalDamage = 0;
    private int fireDamage = 0;
    private int iceDamage = 0;

}
