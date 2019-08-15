package controller;

import entity.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.Arrays;

@SessionScoped
@ManagedBean(name = "productController")
public class ProductController {

    private ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(
            new Product("Product1", 3000, 12,"Product1"),
            new Product("Product2", 2000, 10,"Product2"),
            new Product("Product3", 5000, 20,"Product3"),
            new Product("Product4", 1000, 10,"Product4"),
            new Product("Product5", 1500, 10,"Product5")

    ));

    public  ArrayList<Product> getProducts() {
        return products;
    }

    public String index() {
//        ProductModel productModel = new ProductModel();
//        this.products = productModel.findAll();
        return "index?faces-redirect=true";
    }

}