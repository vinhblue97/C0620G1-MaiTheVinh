import { Component, OnInit } from '@angular/core';
import {CustomerDao} from '../../../model/dao/CustomerDao';
import {CustomerService} from '../../../model/service/customer.service';
import {ICustomer} from '../../../model/interface/ICustomer';

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {

  customerList = CustomerDao ;

  constructor(private customerService: CustomerService) {
  }

  ngOnInit(): void {}

  deleteCustomer(customer: ICustomer) {
    let idCard = this.customerList.indexOf(customer);
    this.customerList.splice(idCard,1);
  }

}
