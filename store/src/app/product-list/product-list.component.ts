import { Component, OnInit } from '@angular/core';
import { Product } from './product';
import { ProductService } from './product.service';
import { workers } from 'cluster';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})

export class ProductListComponent implements OnInit {
  products: Product[];
  newProduct: Product = new Product();
  nums: any[];
  cart: Product[];
  cartShowing: boolean;

  constructor(
    private productService: ProductService,
  ) {}

  ngOnInit(): void {
    this.getProducts();
    // tslint:disable-next-line:prefer-const
    let temp = [];
    for (let i = 0; i < 25; i++) {
        temp[i] = i + 1;
    }
    this.nums = temp;
    this.cartShowing = false;
  }

  getProducts(): void {
    this.productService.getProducts()
      .then(products => this.products = products );
  }

  addItemToCart(product: Product, quantity: any): void {
    if (quantity < product.stock) {
      product.quantity = quantity;
      product.stock -= quantity;
      this.cart.push(product);
    }
    console.log('hi');
  }

  showCart(): void {
    console.log('hi');
    this.cartShowing = true;
  }

  detailPageRedirect(product: Product) {
    //pop up for details
  }
}
