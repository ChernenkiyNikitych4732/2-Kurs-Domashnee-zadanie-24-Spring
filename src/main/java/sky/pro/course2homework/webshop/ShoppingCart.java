package sky.pro.course2homework.webshop;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.Map;

@Component
@SessionScope
public class ShoppingCart {
    private Product product;
    private Map<Integer, Product> chart = new HashMap<>();

    public Map<Integer, Product> getChart() {
        return chart;
    }
}