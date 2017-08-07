// import { NewOrderPage } from './../pages/new-order/new-order';

import { Http, Response, Headers, RequestOptions } from '@angular/http';
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';
import {Injectable} from '@angular/core';


@Injectable()
export class EmailService{
    constructor(private _http:Http){
        
    }

    getEmail() : Observable <any> {
       return this._http.get("http://localhost:8080/email-confirmed").map(res => res.json());
    }
}
