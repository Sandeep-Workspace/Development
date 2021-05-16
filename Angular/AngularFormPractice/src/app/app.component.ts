import { style } from '@angular/animations';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'AngularFormPractice';
  color='Orange'
  err=false
  getUserValues(values:any){
    console.log(values)
  }

  updateColor(){
    this.color='Grey'
  }
}
