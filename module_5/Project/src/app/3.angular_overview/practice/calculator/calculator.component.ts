import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  firstNum:number ;
  secNum : number;
  result:number = 0;

  constructor() { }

  add(){
    this.result = this.firstNum + this.secNum;
  }

  sub(){
    this.result = this.firstNum - this.secNum;
  }

  mul(){
    this.result = this.firstNum * this.secNum;
  }

  div(){
    this.result = this.firstNum / this.secNum;
  }


  ngOnInit(): void {
  }

}
