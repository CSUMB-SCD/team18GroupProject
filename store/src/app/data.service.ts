import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Product } from './product-list/product';


@Injectable({
    providedIn: 'root'
})
export class DataService {
    cart: Product [] = [];

    constructor(private http: Http) {}

    getCart() {
        return this.cart;
    }

    addToCart(product: Product, quantity: number) {
        // const index = this.cart.findIndex(p => p.id === product.id);
        // if (index === -1) {
          console.log(product.quantity);
          console.log(quantity);
          product.quantity += quantity;
          this.cart.push(product);
        // } else {
        //   this.cart[index].quantity = this.cart[index].quantity + quantity;
        // }
    }

    clearCart() {
        this.cart = [];
    }
}
