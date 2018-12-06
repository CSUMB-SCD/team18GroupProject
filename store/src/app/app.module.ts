import { ThirdPageComponent } from './third-page/third-page.component';
import { FirstPageComponent } from './first-page/first-page.component';
import { RouterModule, Routes } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MyNavComponent } from './my-nav/my-nav.component';
import { LayoutModule } from '@angular/cdk/layout';
import { MatToolbarModule, MatButtonModule, MatSidenavModule, MatIconModule, MatListModule } from '@angular/material';
import { ProductListComponent } from './product-list/product-list.component';
import { ProductService } from './product-list/product.service';
import { HttpModule } from '@angular/http';
import { UserService } from './user/user.service';

const appRoutes: Routes = [
  {path: '', component: FirstPageComponent},
  {path: 'product-list', component: ProductListComponent},
  {path: 'third-page', component: ThirdPageComponent}

];

@NgModule({
  declarations: [
    AppComponent,
    MyNavComponent,
    FirstPageComponent,
    ProductListComponent,
    ThirdPageComponent,
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpModule,
    RouterModule.forRoot(appRoutes),
    LayoutModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule
  ],
  providers: [ProductService, UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
