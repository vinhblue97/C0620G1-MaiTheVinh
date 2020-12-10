import {Component, Input, OnInit} from '@angular/core';
import {IStudent} from '../IStudent';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {
  @Input()
  studentChild: IStudent;
  constructor() { }

  ngOnInit(): void {
  }

  changeMark(event) {
    this.studentChild.mark = event.target.value;
  }
}
