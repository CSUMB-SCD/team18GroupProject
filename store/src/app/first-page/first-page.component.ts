import { Component, OnInit } from '@angular/core';
import { UserService } from '../user/user.service';

@Component({
  selector: 'app-first-page',
  templateUrl: './first-page.component.html',
  styleUrls: ['./first-page.component.css']
})
export class FirstPageComponent implements OnInit {
  showLoginForms: boolean;
  loginConfirmed: boolean;
  showSignupForms: boolean;

  constructor(private Auth: UserService) { }

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
    const result = this.Auth.getUsername(username);
    if (result) {
      console.log(result);
    } else {
      this.Auth.createUser(username, password);
      console.log('not a user');
    }
    console.log(username, password);
  }

  onSignupSubmit(): void {

  }
}
