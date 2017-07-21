import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { Http } from '@angular/http';
import {VendorService} from '../../services/vendorService';

/**
 * Generated class for the AllVendorsPage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
@IonicPage()
@Component({
  selector: 'page-all-vendors',
  templateUrl: 'all-vendors.html',
  providers: [VendorService]
})
export class AllVendorsPage {

  vendors: any;

  constructor(public navCtrl: NavController, public navParams: NavParams, public vendorService: VendorService) {
    vendorService.getAllVendors().subscribe(data=> {
      this.vendors = data;
    })
  }

  getVendors(){
    this.vendorService.getAllVendors().subscribe(data=> {
      this.vendors = data;
    })
  }

  deleteVendor(id:number){
    this.vendorService.deleteVendor(id).subscribe(data=> {
      console.log(data);
      this.getVendors;
    });
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad AllVendorsPage');
  }

}
