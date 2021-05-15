import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  show =false
  color="violet"
  dataArray=['Sandeep','Digpal','Sachin','Yash']

  objectArray =[
    {
      name:"Sandeep",
      age:28
    },
    {
      name:"Sachin",
      age:28
    },
    {
      name:"Yash",
      age:27
    },
    {
      name:"Digpal",
      age:27
    }
  ]
  constructor() { }

  ngOnInit(): void {
  }

}
