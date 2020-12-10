import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {CarService} from "../../model/service/car.service";

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  formEdit: FormGroup;

  constructor(private fb: FormBuilder,private activatedRoute: ActivatedRoute, private carService: CarService,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const idEdit = paramMap.get('id');
      this.carService.findById(idEdit).subscribe(data =>{
        console.log(data);
        this.formEdit = this.fb.group({
          id: '',
          type: ['', Validators.required],
          supplier: ['', Validators.required],
          beginPlace: ['', Validators.required],
          endingPlace: ['', Validators.required],
          numberPhone: ['', Validators.required],
          email: ['', Validators.required],
          beginTime: ['', Validators.required],
          endTime: ['', Validators.required],
        })
        this.formEdit.patchValue(data);
      });

    });
  }

  ngOnInit(): void {
  }

  onEdit(formEdit: FormGroup) {
    this.carService.editById(formEdit.value, formEdit.value.id).subscribe(data => {
      this.router.navigateByUrl("/list");

    });
  }
}
