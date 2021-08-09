package SBoot.SpringDocker.inheritance;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class Man {
    private String name;

}

@Data
class BusinessMan extends Man{
    private final String company;
    private final String position;
}
