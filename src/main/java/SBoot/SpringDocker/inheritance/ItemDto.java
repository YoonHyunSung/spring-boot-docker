package SBoot.SpringDocker.inheritance;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ItemDto {
    @Id
    private long itemId;
}
