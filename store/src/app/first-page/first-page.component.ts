import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first-page',
  templateUrl: './first-page.component.html',
  styleUrls: ['./first-page.component.css']
})
export class FirstPageComponent implements OnInit {
  showLoginForms: boolean;
  loginConfirmed: boolean;
  showSignupForms: boolean;

  constructor() { }

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

  confirmLogin(): void {

  }

  onLoginSubmit(): void {

  }

  onSignupSubmit(): void {

  }
}
