import {Component, OnInit} from '@angular/core';
import {CustomerDao} from '../../model/dao/CustomerDao';
import {CustomerService} from '../../model/service/customer.service';
import {ICustomer} from '../../model/interface/ICustomer';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {


  constructor() {
  }

  ngOnInit(): void {}



}
