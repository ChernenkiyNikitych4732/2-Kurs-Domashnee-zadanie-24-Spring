package sky.pro.course2homework.webshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/order/")
public class ShopController {
    private final ShopService shopService;
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }
    @GetMapping("/add")
    public String add(@RequestParam ("name") String name, @RequestParam("price") Double price){
        shopService.add(name, price);
        return "товар <b> " + name + " " + price + "</b> добавлен";
    }

    @GetMapping("/get")
    public String get(){
        return shopService.get();
    }
}