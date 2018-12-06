import { Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';
import { User } from './user';

@Injectable()
export class UserService {
  private baseUrl = 'http://localhost:8080';

  constructor(private http: Http) { }

  getAll() {
      return this.http.get(this.baseUrl + '/users/');
  }

  getById(id: String) {
      return this.http.get(this.baseUrl + '/users/' + id);
  }

  getUsername(username: String) {
      return this.http.get(this.baseUrl + '/username/' + username);
  }

  createUser(username: String, password: String) {
      return this.http.post(this.baseUrl + '/users/', username, password);
  }
}
