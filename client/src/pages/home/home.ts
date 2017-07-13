import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { NewOrderPage} from '../new-order/new-order';
import {ProductPage} from '../product/product';
import {VendorPage} from '../vendor/vendor';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  constructor(public navCtrl: NavController) {

  }

  goToNewOrder(){
    this.navCtrl.push(NewOrderPage);
  }
  goToNewProduct(){
    this.navCtrl.push(ProductPage);
  }

  goToVendor(){
    this.navCtrl.push(VendorPage);
  }

}
