import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MoodComponent } from './mood/mood.component';
import { PeoplelistComponent } from './peoplelist/peoplelist.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsComponent } from './forms/forms.component';
import { ReactiveFormsModule } from '@angular/forms';
import { AnimateComponent } from './animate/animate.component'; 

@NgModule({
  declarations: [
    AppComponent,
    MoodComponent,
    PeoplelistComponent,
    FormsComponent,
    AnimateComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    BrowserAnimationsModule, 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
