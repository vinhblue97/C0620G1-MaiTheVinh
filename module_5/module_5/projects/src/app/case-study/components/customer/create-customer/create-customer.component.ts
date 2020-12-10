import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerDao} from '../../../model/dao/CustomerDao';
import {Router} from '@angular/router';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {

  formCreate: FormGroup;
  customerList = CustomerDao;

  constructor(private fb: FormBuilder, private router: Router) {
  }

  ngOnInit(): void {
    this.formCreate = this.fb.group({
      id: ['', [Validators.required, Validators.pattern('^KH-\\d{4}$')]],
      name: ['', Validators.required],
      birthDay: ['', [Validators.required, this.birthDayValidation]],
      gender: ['Female', Validators.required],
      idCard: ['', [Validators.required, Validators.pattern('^(\\d{9}||\\d{12})$')]],
      phone: ['', [Validators.required, Validators.pattern('^(090|091|(84+90)|(84+91))\\d{7}$')]],
      email: ['', [Validators.required, Validators.pattern('^[A-z]\\w+@[a-z]+(\\.[a-z]+){1,3}$')]],
      type: ['Diamond', Validators.required],
      address: ['', Validators.required]
    });
  }

  onSubmit() {
    console.log(this.formCreate.value);
    this.customerList.unshift(this.formCreate.value);
    this.router.navigateByUrl('list-customer');
  }

  birthDayValidation(formControl: FormControl) {
    let today = new Date();
    let yearBirth = new Date(formControl.value);
    if (yearBirth.getFullYear() < today.getFullYear() - 18) {
      return null;
    }
    return {birthDayError: true};
  }
}
