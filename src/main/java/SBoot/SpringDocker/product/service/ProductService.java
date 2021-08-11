package SBoot.SpringDocker.product.service;

import SBoot.SpringDocker.inheritance.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

public abstract class ProductService {
    abstract String abc();
    String acd(){return "";}
}
