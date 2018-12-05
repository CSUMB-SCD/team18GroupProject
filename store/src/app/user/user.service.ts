import { Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';

@Injectable()
export class UserService {
  private baseUrl = 'http://localhost:8080';

  constructor(private http: Http) { }

  getAll() {
      return this.http.get<User[]>(`${config.apiUrl}/users`);
  }

  getById(id: String) {
      return this.http.get(`${config.apiUrl}/users/` + id);
  }

  register(user: User) {
      return this.http.post(`${config.apiUrl}/users/register`, user);
  }

  update(user: User) {
      return this.http.put(`${config.apiUrl}/users/` + user.id, user);
  }

  delete(id: String) {
      return this.http.delete(`${config.apiUrl}/users/` + id);
  }
}
