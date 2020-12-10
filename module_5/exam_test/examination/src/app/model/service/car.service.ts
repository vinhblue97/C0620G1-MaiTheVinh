import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CarService {

  private baseUrl = 'http://localhost:3000';

  constructor(private http:HttpClient) { }

  public findAll(): Observable<any> {
    return this.http.get(this.baseUrl + '/list');
  }

  public findById(id): Observable<any> {
    return this.http.get(this.baseUrl+'/list/'+id);
  }

  public deleteById(id): Observable<any> {
    return this.http.delete(this.baseUrl + '/list' + '/' + id);
  }

  public editById(car, id): Observable<any> {
    return this.http.put(this.baseUrl + '/list/' + id, car)
  }
}
