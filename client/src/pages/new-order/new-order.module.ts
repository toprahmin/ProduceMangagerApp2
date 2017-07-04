import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { NewOrderPage } from './new-order';

@NgModule({
  declarations: [
    NewOrderPage,
  ],
  imports: [
    IonicPageModule.forChild(NewOrderPage),
  ],
  exports: [
    NewOrderPage
  ]
})
export class NewOrderPageModule {}
