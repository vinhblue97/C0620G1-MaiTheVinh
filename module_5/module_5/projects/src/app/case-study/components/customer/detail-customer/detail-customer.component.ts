import { Component, OnInit } from '@angular/core';
import {ICustomer} from '../../../model/interface/ICustomer';
import {Subscription} from 'rxjs';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {CustomerService} from '../../../model/service/customer.service';

@Component({
  selector: 'app-detail-customer',
  templateUrl: './detail-customer.component.html',
  styleUrls: ['./detail-customer.component.css']
})
export class DetailCustomerComponent implements OnInit {

  customer: ICustomer;
  sub: Subscription;
  constructor(private activatedRoute: ActivatedRoute, private customerService: CustomerService) { }

  ngOnInit(): void {
    this.sub = this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const idCard = paramMap.get('idCard');
      this.customer = this.customerService.findCustomerByIdCard(idCard);
    });
  }


}
