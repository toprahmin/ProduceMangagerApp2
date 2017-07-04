import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import {Http} from '@angular/http';
import {ProductService} from '../product/productservice';

/**
 * Generated class for the AllProductsPage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
@IonicPage()
@Component({
  selector: 'page-all-products',
  templateUrl: 'all-products.html',
  providers: [ProductService]
})
export class AllProductsPage {

  products: any;

  constructor(public navCtrl: NavController, public navParams: NavParams, public productService:ProductService) {
    productService.getAllProducts().subscribe(data => {
      this.products = data;
    })
}

getProducts(){
  this.productService.getAllProducts().subscribe(data => {
    this.products = data;
  })
}

deleteProduct(id:number){
  this.productService.deleteProduct(id).subscribe(data => {
    console.log(data);
    this.getProducts();
  });  
}




  ionViewDidLoad() {
    console.log('ionViewDidLoad AllProductsPage');
  }




}
