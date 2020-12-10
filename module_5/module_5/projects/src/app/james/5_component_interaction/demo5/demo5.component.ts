import {Component, OnInit} from '@angular/core';
import {IStudent} from './IStudent';


@Component({
  selector: 'app-demo5',
  templateUrl: './demo5.component.html',
  styleUrls: ['./demo5.component.css']
})
export class Demo5Component implements OnInit {
  studentParent: IStudent;
  fontColor = '#000000';
  newStudent: IStudent;

  public studentList: Array<IStudent> = [
    {
      id: 1,
      name: 'Mai Thế Vinh',
      age: 23,
      mark: 6,
      image: ''
    },
    {
      id: 2,
      name: 'XYZ',
      age: 25,
      mark: 7,
      image: ''
    },
    {
      id: 3,
      name: 'ABC',
      age: 20,
      mark: 8,
      image: ''
    }
  ];

  constructor() {
  }

  ngOnInit(): void {
  }

  getData(student: IStudent) {
    this.studentParent = student;
  }

    changeColor(event) {
      console.log(event.target.value);
      if (event.target.value <= 4) {
          this.fontColor = '#FF0000';
      } else{
        this.fontColor = '#000000';
      }
    }

  goCreate(length) {
    this.newStudent = {
      age: 0, id: length.target.value, mark: 0, name: ''
    };
  }
}
