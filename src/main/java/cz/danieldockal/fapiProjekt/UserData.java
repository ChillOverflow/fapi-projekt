package cz.danieldockal.fapiProjekt;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
 * © Created by Daniel Dockal
 *        1.5.2022
 * */

@Entity
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(max = 40)
    private String name;

    @NotNull
    @Size(max = 100)
    private String street;

    @NotNull
    @Size(max = 100)
    private String city;

    @NotNull
    @Size(max = 100)
    private String email;

    @NotNull
    @Size(min = 6,max = 100)
    private String password;

    @NotNull
    @Size(max = 25)
    private String stockName;

    @NotNull
    private Double stockPrice;

    @NotNull
    private Integer stockCount;

    public UserData() {
    }

    public UserData(String name, String street, String city) {
        this.name = name;
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getStockName() {
        return stockName;
    }

    public Double getStockPrice() {
        return stockPrice;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }
}
