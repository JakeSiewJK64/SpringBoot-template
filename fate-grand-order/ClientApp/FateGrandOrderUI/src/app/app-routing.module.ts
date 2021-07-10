import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FetchBooksComponent } from './fetch-books/fetch-books.component';
import { HomeComponent } from './home/home.component';

const permission = {
  role: ['Administrator', 'Support', 'Lab']
};

const routes: Routes = [
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'fetch-books',
    component: FetchBooksComponent
  },
  {
    path: '**',
    redirectTo: 'home'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
