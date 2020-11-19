import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';
import { ChangeFontSizeComponent } from './3.angular_overview/practice/change-font-size/change-font-size.component';
import { PetComponent } from './3.angular_overview/practice/pet/pet.component';
import { BootstrapComponent } from './3.angular_overview/practice/bootstrap/bootstrap.component';
import { CalculatorComponent } from './3.angular_overview/practice/calculator/calculator.component';
import { ColorPickerComponent } from './3.angular_overview/exercise/color-picker/color-picker.component';
import {HackerNewsComponent} from './4. Angular Component & Template/practice/hacker-news/hacker-news.component';
import { LikesComponent } from './4. Angular Component & Template/practice/hacker-news/likes/likes.component';
import { FullyHackerNewsComponent } from './4. Angular Component & Template/exercise/fully-hacker-news/fully-hacker-news.component';
import { NavbarFullyHackerNewsComponent } from './4. Angular Component & Template/exercise/fully-hacker-news/navbar-fully-hacker-news/navbar-fully-hacker-news.component';
import { FooterFullyHackerNewsComponent } from './4. Angular Component & Template/exercise/fully-hacker-news/footer-fully-hacker-news/footer-fully-hacker-news.component';



@NgModule({
  declarations: [
    AppComponent,
    ChangeFontSizeComponent,
    PetComponent,
    BootstrapComponent,
    CalculatorComponent,
    ColorPickerComponent,
    HackerNewsComponent,
    LikesComponent,
    FullyHackerNewsComponent,
    NavbarFullyHackerNewsComponent,
    FooterFullyHackerNewsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
