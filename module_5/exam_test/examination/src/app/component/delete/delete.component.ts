import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {CarService} from "../../model/service/car.service";
import {ICar} from "../../model/interface/ICar";

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {
  car: ICar;

  constructor(
    public dialogRef: MatDialogRef<DeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    private carService: CarService) {
  }

  ngOnInit(): void {
    this.car = this.data.carData;
  }

  delete(id: string) {
    this.carService.deleteById(id).subscribe(data =>{
      this.dialogRef.close();
    })
  }
}
