import { EmailService } from './../../Services/emailService';
import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';

/**
 * Generated class for the EmailSuccessPage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
@IonicPage()
@Component({
  selector: 'page-email-success',
  templateUrl: 'email-success.html',
  providers: [EmailService]
})
export class EmailSuccessPage {

  constructor(public navCtrl: NavController, public navParams: NavParams, public emailService:EmailService) {
    emailService.getEmail();
}

  goToHome(){
    this.navCtrl.popToRoot();
  }

  getEmail(){
    this.emailService.getEmail();
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad EmailSuccessPage');
  }

}
