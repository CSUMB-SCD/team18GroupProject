import { Component, OnInit } from '@angular/core';
import { Product } from './product';
import { ProductService } from './product.service';
import { DataService } from '../data.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})

export class ProductListComponent implements OnInit {
  selectedOption: number;
  products: Product[];
  cartItems: Product[];
  newProduct: Product = new Product();
  nums: number[];
  showDetails: boolean;
  productDetails: Product;
  addedToCart: boolean;
  notLoggedInMsg: boolean;

  constructor(
    private productService: ProductService,
    private dataService: DataService,
  ) {}

  ngOnInit(): void {
    this.getProducts();
    // tslint:disable-next-line:prefer-const
    let temp = [];
    for (let i = 0; i < 25; i++) {
        temp[i] = i + 1;
    }
    this.nums = temp;
    this.selectedOption = 1;
    this.showDetails = false;
    this.productDetails = new Product();
    this.addedToCart = false;
    this.notLoggedInMsg = false;
  }

  getProducts(): void {
    this.productService.getProducts()
      .then(products => this.products = products );
  }

  onChange(val): void {
    this.selectedOption = val;
  }

  addItemToCart(product: Product, quantity: number): void {
    if (!this.dataService.getLoginState()) {
      this.notLoggedInMsg = true;
      setTimeout(() => this.finishAddingToCart(), 1000);
    } else {
      if (quantity < product.stock) {
        // product.quantity += quantity;
        // product.stock -= quantity;
        // this.cartItems.push(product);
        this.dataService.addToCart(product, quantity);
        this.addedToCart = true;
        setTimeout(() => this.finishAddingToCart(), 1000);
      }
    }
  }

  detailPageRedirect(product: Product) {
    this.productDetails = product;
    this.showDetails = !this.showDetails;
  }

  finishAddingToCart() {
    this.addedToCart = false;
    this.notLoggedInMsg = false;
  }
}
