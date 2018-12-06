import { Component, OnInit } from '@angular/core';
import { UserService } from '../user/user.service';
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

  constructor(private Auth: UserService, private router: Router) { }

  ngOnInit() {
    this.showLoginForms = false;
    this.loginConfirmed = false;
    this.showSignupForms = false;
  }

  showLogin(): void {
    this.showLoginForms = !this.showLoginForms;
  }
  showSignup(): void {
    this.showSignupForms = !this.showSignupForms;
  }

  onLoginSubmit(event): void {
    const target = event.target;
    const username = target.querySelector('#username').value;
    const password = target.querySelector('#password').value;
    const result = this.Auth.getUsername(username).subscribe(data => this.User$ = data);
    this.router.navigate(['/product-list']);
    // console.log(this.User$);
    // if (this.User$ != null) {
    // } else {
    // }
  }

  onSignupSubmit(): void {

  }
}
