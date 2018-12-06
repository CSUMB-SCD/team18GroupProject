import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Product } from './product-list/product';


@Injectable({
    providedIn: 'root'
})
export class DataService {
    cart: Product [] = [];
    loggedIn: boolean;

    constructor(private http: Http) {}

    getCart() {
        return this.cart;
    }

    getLoginState(): boolean {
        return this.loggedIn;
    }

    login() {
        this.loggedIn = true;
    }

    logout() {
        this.loggedIn = false;
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
