import { Component, OnInit } from '@angular/core';
import { UserService } from '../user/user.service';
import { DataService } from '../data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-first-page',
  templateUrl: './first-page.component.html',
  styleUrls: ['./first-page.component.css']
})
export class FirstPageComponent implements OnInit {
  User$: Object = null;
  showLoginForms: boolean;
  loginConfirmed: boolean;
  showSignupForms: boolean;
  isLoggedIn: boolean;

  constructor(
    public dataService: DataService,
    private Auth: UserService,
    private router: Router) { }

  ngOnInit() {
    this.showLoginForms = false;
    this.loginConfirmed = false;
    this.showSignupForms = false;
    this.isLoggedIn = false;
  }

  showLogin(): void {
    this.showLoginForms = !this.showLoginForms;
  }
  showSignup(): void {
    this.showSignupForms = !this.showSignupForms;
  }

  onLoginSubmit(event): void {
    const target = event.target;
    // const username = target.querySelector('#username').value;
    // const password = target.querySelector('#password').value;
    // const result = this.Auth.getUsername(username).subscribe(data => this.User$ = data);
    this.dataService.login();

    this.router.navigate(['/product-list']);
  }

  redirect() {
    this.dataService.logout();
    this.dataService.clearCart();
  }

  onSignupSubmit(): void {

  }
}
