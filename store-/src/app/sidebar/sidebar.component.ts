import { Component, OnInit } from '@angular/core';
import { Router, NavigationEnd } from '@angular/router';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.scss']
})
export class SidebarComponent implements OnInit {

  currentUrl: string;

  constructor(private router: Router) {
    router.events.subscribe((_: NavigationEnd) => {
    //  console.log(_.url);
      if (_.url === undefined) {

      } else {
        console.log(_.url);
      this.currentUrl = _.url;
      }
    });
  }

  ngOnInit() {}

}
