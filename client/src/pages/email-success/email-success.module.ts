import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { EmailSuccessPage } from './email-success';

@NgModule({
  declarations: [
    EmailSuccessPage,
  ],
  imports: [
    IonicPageModule.forChild(EmailSuccessPage),
  ],
  exports: [
    EmailSuccessPage
  ]
})
export class EmailSuccessPageModule {}
