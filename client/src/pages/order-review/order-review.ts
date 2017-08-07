import { EmailService } from './../../Services/emailService';
import { EmailSuccessPage } from './../email-success/email-success';
import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, AlertController } from 'ionic-angular';
import {Http} from '@angular/http';
import { NewOrderService} from '../new-order/new-orderService';




@Component({
  selector: 'page-order-review',
  templateUrl: 'order-review.html',
  providers: [NewOrderService, EmailService]
})
export class OrderReviewPage {

  orderItems: any;

  constructor(public navCtrl: NavController, public navParams: NavParams, public newOrderService:NewOrderService, public alertCtrl: AlertController,public emailService: EmailService) {
    newOrderService.getAllOrderItems().subscribe(data => {
      this.orderItems = data;
    })
  }
  
  deleteOrderItem(id:number){
    this.newOrderService.deleteOrderItem(id).subscribe(data => {
      console.log(data);
      this.getOrderItems();
    });
  }

  getOrderItems(){
    this.newOrderService.getAllOrderItems().subscribe(data =>{
      this.orderItems = data;
    })
  }

  editQuantity(orderItem){
    console.log(orderItem);

    let prompt = this.alertCtrl.create({
      title: "Edit Quantity",
      inputs: [{
        name : 'updateQuantity'
      }],
      buttons: [
        {
          text: 'Cancel'
        },
        {
          text: "Save",
          handler: data => {
            orderItem.quantity = data.updateQuantity;
            this.newOrderService.updateOrderItem(orderItem)
            .map(res => res.json())
            .subscribe(data => {
              console.log(data);
              this.getOrderItems();
            });
          }
        }
      ]
    });
    this.getOrderItems();
    prompt.present();
  }

  goToEmailSuccess(){
    this.emailService.getEmail();
    this.navCtrl.push(EmailSuccessPage);
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad OrderReviewPage');
  }



}
