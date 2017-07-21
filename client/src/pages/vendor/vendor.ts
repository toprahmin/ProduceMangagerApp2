import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import {Http} from '@angular/http';
import {VendorService} from '../../services/vendorservice';



@Component({
  selector: 'page-vendor',
  templateUrl: 'vendor.html',
  providers: [VendorService]
})
export class VendorPage {
  vendors: any;
  vendor = {}

  constructor(public navCtrl: NavController, public navParams: NavParams,public vendorService: VendorService) {
}

  ionViewDidLoad() {
    console.log('ionViewDidLoad VendorPage');
  }

  postVendor(){
    this.vendorService.postVendor(this.vendor).map(res => res.json()).subscribe(data => {
      console.log(data);
    })
  }

  goToVendors(){
    this.navCtrl.push(VendorPage);
  }

}
