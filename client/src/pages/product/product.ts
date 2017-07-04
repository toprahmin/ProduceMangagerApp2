import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { Http } from '@angular/http';
import {ProductService} from '../product/productservice';
import {AllProductsPage} from '../all-products/all-products';

/**
 * Generated class for the ProductPage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
@IonicPage()
@Component({
  selector: 'page-product',
  templateUrl: 'product.html',
  providers:[ProductService]
})

export class ProductPage {
  
  products:any;
  product ={}
  constructor(public navCtrl: NavController, public navParams: NavParams, public productService:ProductService) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad ProductPage');
  }
  
  postProduct(){
    this.productService.postProduct(this.product)
    .map(response => response.json()).subscribe(data =>{
      console.log(data);
    })
  }

  viewAllProducts(){
    this.navCtrl.push(AllProductsPage);
  }

}
