import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { AllVendorsPage } from './all-vendors';

@NgModule({
  declarations: [
    AllVendorsPage,
  ],
  imports: [
    IonicPageModule.forChild(AllVendorsPage),
  ],
  exports: [
    AllVendorsPage
  ]
})
export class AllVendorsPageModule {}
