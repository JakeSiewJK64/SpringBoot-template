import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MaterialModule } from './material.module';
import { CovalentModule } from './covalent.module';
import { FlexLayoutModule } from '@angular/flex-layout';
import { HttpClientModule } from '@angular/common/http';



@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    MaterialModule,
    CovalentModule,
    FlexLayoutModule,
    HttpClientModule
  ],
  exports: [
    MaterialModule,
    CovalentModule,
    FlexLayoutModule,
    HttpClientModule
  ]
})
export class SharedModule { }
