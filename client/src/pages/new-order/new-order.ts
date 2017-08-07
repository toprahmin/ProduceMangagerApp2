import { EmailService } from './../../Services/emailService';
import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { NewOrderService} from '../new-order/new-orderService';
import { Http } from '@angular/http';
import {OrderReviewPage} from '../order-review/order-review';

@Component({
  selector: 'page-new-order',
  templateUrl: 'new-order.html',
  providers: [NewOrderService]
})

export class NewOrderPage {

  orderItems: any;
  orderItem = {
      // productDescription : "",
      // quantity : 0
    }
  

  constructor(public navCtrl: NavController, public navParams: NavParams, public newOrderService: NewOrderService) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad NewOrderPage');
  }

  

  postOrderItem(){
    this.newOrderService.postOrderItem(this.orderItem).map(res => res.json()).subscribe(data =>{
      console.log(data);
    })
  }

  goToOrderReview(){
    this.navCtrl.push(OrderReviewPage);
  }

}
