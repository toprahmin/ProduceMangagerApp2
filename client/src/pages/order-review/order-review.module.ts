import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { OrderReviewPage } from './order-review';

@NgModule({
  declarations: [
    OrderReviewPage,
  ],
  imports: [
    IonicPageModule.forChild(OrderReviewPage),
  ],
  exports: [
    OrderReviewPage
  ]
})
export class OrderReviewPageModule {}
