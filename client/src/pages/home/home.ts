import { Component, ViewChild } from '@angular/core';
import { NavController } from 'ionic-angular';
import { NewOrderPage} from '../new-order/new-order';
import {ProductPage} from '../product/product';
import {VendorPage} from '../vendor/vendor';
import { Slides } from 'ionic-angular';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  constructor(public navCtrl: NavController) {

  }

  
    @ViewChild(Slides) slides: Slides;

    startAutoPlay(){
      this.slides.startAutoplay();
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
