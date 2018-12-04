import { Component, OnInit } from '@angular/core';
import { Product } from './product';
import { ProductService } from './product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html'
})

export class ProductListComponent implements OnInit {
  products: Product[];
  newProduct: Product = new Product();

  constructor(
    private productService: ProductService,
  ) {}

  ngOnInit(): void {
    this.getProducts();
  }

  getProducts(): void {
    this.productService.getProducts()
      .then(products => this.products = products );
  }
}
