import { EmailService } from './../Services/emailService';
import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';
import {HttpModule} from '@angular/http';

import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { NewOrderPage } from '../pages/new-order/new-order';
import { OrderReviewPage } from "../pages/order-review/order-review";
import { ProductPage } from "../pages/product/product";
import { AllProductsPage } from "../pages/all-products/all-products";
import { VendorPage } from "../pages/vendor/vendor";
import { AllVendorsPage } from "../pages/all-vendors/all-vendors"; 
import { VendorService } from "../services/vendorService";
import { ProductService } from "../services/productservice";
import { EmailSuccessPage} from "../pages/email-success/email-success";

import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    NewOrderPage,
    OrderReviewPage,
    ProductPage,
    AllProductsPage,
    VendorPage,
    AllVendorsPage,
    EmailSuccessPage

  ],
  imports: [
    BrowserModule,HttpModule,
    IonicModule.forRoot(MyApp),
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    NewOrderPage,
    OrderReviewPage,
    ProductPage,
    AllProductsPage,
    VendorPage,
    AllVendorsPage,
    EmailSuccessPage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler},
     VendorService, 
     ProductService,
     EmailService
  ]
})
export class AppModule {}
