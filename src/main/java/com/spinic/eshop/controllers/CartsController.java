package com.spinic.eshop.controllers;

import static org.springframework.http.ResponseEntity.ok;

import com.spinic.eshop.CartApi;
import com.spinic.eshop.model.Cart;
import com.spinic.eshop.model.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.List;


/**
 * @author : github.com/nicolaespinu
 * @project : e-Commerce with Spring Boot
 * @created : 10/14/2022 Friday
 */
@RestController
public class CartsController implements CartApi {

    private static final Logger log = LoggerFactory.getLogger(CartsController.class);

    @Override
    public ResponseEntity<List<Item>> addOrReplaceItemsByCustomerId(String customerId, Item item) {
        return CartApi.super.addOrReplaceItemsByCustomerId(customerId, item);
    }

    @Override
    public ResponseEntity<Void> deleteCart(String customerId) {
        return CartApi.super.deleteCart(customerId);
    }

    @Override
    public ResponseEntity<Void> deleteItemFromCart(String customerId, String itemId) {
        return CartApi.super.deleteItemFromCart(customerId, itemId);
    }

    @Override
    public ResponseEntity<List<Cart>> getCartByCustomerId(String customerId) {
        return CartApi.super.getCartByCustomerId(customerId);
    }

    @Override
    public ResponseEntity<List<Item>> getCartItemsByCustomerId(String customerId) {
        return CartApi.super.getCartItemsByCustomerId(customerId);
    }

    @Override
    public ResponseEntity<List<Item>> getCartItemsByItemId(String customerId, String itemId) {
        return CartApi.super.getCartItemsByItemId(customerId, itemId);
    }

    @Override
    public ResponseEntity<List<Item>> addCartItemsByCustomerId(String customerId, Item item) {
        log.info("Request for customer ID: {}\nItem: {}", customerId, item);
        return ok(Collections.EMPTY_LIST);
    }
}
