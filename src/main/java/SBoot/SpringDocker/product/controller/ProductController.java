package SBoot.SpringDocker.product.controller;

import SBoot.SpringDocker.inheritance.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor
public class ProductController {
    private final ItemService itemService;
}
