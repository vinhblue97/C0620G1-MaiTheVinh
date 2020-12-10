import {Injectable} from '@angular/core';
import {CustomerDao} from '../dao/CustomerDao';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  customerList = CustomerDao;

  constructor() {
  }

  findCustomerByIdCard(idCard: number | string) {
    return this.customerList.find(item => item.customerIdCard === idCard);
  }
}
