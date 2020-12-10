import { Component, OnInit } from '@angular/core';
import {Observable, Observer} from 'rxjs';

@Component({
  selector: 'app-color-picker',
  templateUrl: './color-picker.component.html',
  styleUrls: ['./color-picker.component.css']
})
export class ColorPickerComponent implements OnInit {

  color = '#0000ff';

  constructor() { }

  ngOnInit(): void {
  }

}
