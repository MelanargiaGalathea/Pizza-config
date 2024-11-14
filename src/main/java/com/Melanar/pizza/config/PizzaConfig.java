package com.Melanar.pizza.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "pizza")
//@Data
//@AllArgsConstructor
public class PizzaConfig {
    String sauce;
    String topping;
    String crust;

    public PizzaConfig() {}

    public String getSauce() {
        return sauce;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public PizzaConfig (String sauce, String topping, String crust) {
        this.sauce = sauce;
        this.topping = topping;
        this.crust = crust;
    }

    public String getCrust() {
        return crust;
    }
}
