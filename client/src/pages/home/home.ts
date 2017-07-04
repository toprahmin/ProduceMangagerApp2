import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { NewOrderPage} from '../new-order/new-order';

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

}
