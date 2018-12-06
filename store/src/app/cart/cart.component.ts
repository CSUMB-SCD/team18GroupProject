import { Component, OnInit } from '@angular/core';
import { Cart } from './cart';
import { Product } from '../product-list/product';
import { DataService } from '../data.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})

export class CartComponent implements OnInit {
  cartItems: Product[] = [];
  total: number;

  constructor(
    private dataService: DataService,
  ) {}

  ngOnInit(): void {
    this.getCartItems();
    this.total = 0;
  }

  getCartItems(): void {
    this.cartItems = this.dataService.getCart();
    for (let i = 0; i < this.cartItems.length; i++) {
      this.total += this.cartItems[i].price;
    }
  }
}
