import { Component, OnInit } from '@angular/core';
import { Product } from '../product-list/product';
import { DataService } from '../data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})

export class CartComponent implements OnInit {
  cartItems: Product[] = [];
  total: number;
  showCheckout: boolean;
  showThanks: boolean;

  constructor(
    private dataService: DataService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.total = 0;
    this.getCartItems();
    this.showCheckout = false;
    this.showThanks = false;
  }

  getCartItems(): void {
    this.cartItems = this.dataService.getCart();
    for (let i = 0; i < this.cartItems.length; i++) {
      this.total += this.cartItems[i].price;
    }
  }

  redirect() {
    this.showCheckout = true;
  }

  confirmPurchase() {
    this.cartItems = this.dataService.getCart();
    for (let i = 0; i < this.cartItems.length; i++) {
      this.cartItems[i].stock -= this.cartItems[i].quantity;
    }
    this.showCheckout = false;
    this.showThanks = true;
  }

  redirectToHome() {
    this.dataService.clearCart();
    this.cartItems = [];
    this.router.navigate(['/']);
  }
}
