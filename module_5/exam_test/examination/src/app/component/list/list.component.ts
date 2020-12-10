import {Component, OnInit} from '@angular/core';
import {CarService} from "../../model/service/car.service";
import {ICar} from "../../model/interface/ICar";
import {DeleteComponent} from "../delete/delete.component";
import {MatDialog} from "@angular/material/dialog";

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  carList: Array<ICar>

  constructor(private carService: CarService, private dialog: MatDialog) {
  }

  ngOnInit(): void {
    this.carService.findAll().subscribe(data => {
      console.log(data);
      this.carList = data;
    })
  }

  openDialog(id): void {
    this.carService.findById(id).subscribe(data=>{
      const dialogRef = this.dialog.open(DeleteComponent, {
        width: '500px',
        height: '300px',
        data: {carData: data}
      });
      dialogRef.afterClosed().subscribe(result => {
        this.ngOnInit();
      });
    })



  }
}
