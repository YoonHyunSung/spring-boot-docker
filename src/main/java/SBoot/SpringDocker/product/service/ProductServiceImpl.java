package SBoot.SpringDocker.product.service;

import SBoot.SpringDocker.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl {
    private final ProductRepository productRepository;

//    @Override
//    public String abc(){
//        return null;
//    }
}
