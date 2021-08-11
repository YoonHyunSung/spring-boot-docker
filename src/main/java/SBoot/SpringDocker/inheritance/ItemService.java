package SBoot.SpringDocker.inheritance;


import lombok.RequiredArgsConstructor;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
}
