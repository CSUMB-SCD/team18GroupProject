import { Injectable } from '@angular/core';
import { Product } from './product';
import { Headers, Http } from '@angular/http';

@Injectable()
export class ProductService {
  private baseUrl = 'http://localhost:8080';

  constructor(private http: Http) { }

  getProducts():  Promise<Product[]> {
    return this.http.get(this.baseUrl + '/allProducts/')
      .toPromise()
      .then(response => response.json() as Product[])
      .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('Some error occured', error);
    return Promise.reject(error.message || error);
  }
}
