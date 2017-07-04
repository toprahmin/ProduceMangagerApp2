import { Http, Response, Headers, RequestOptions } from '@angular/http';
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';
import {Injectable} from '@angular/core';

@Injectable()
export class NewOrderService{
    constructor(private _http: Http){}

    

getAllOrderItems(): Observable<any>{
    return this._http.get("http://localhost:8080/neworder/")
    .map(res => res.json());
    }


postOrderItem(orderItem: any): Observable<any>{
    let headers = new Headers();
    headers.append('Content-Type', 'application/json');
    return this._http.post("http://localhost:8080/neworder/", JSON.stringify(orderItem),{headers:headers});    
}

 deleteOrderItem(id:Number): Observable<any> {
        return this._http.delete("http://localhost:8080/neworder/"+id);
    }

updateOrderItem(orderItem: any) : Observable<any>{
    let headers = new Headers();
    headers.append('Content-Type', 'application/json');
    return this._http.put("http://localhost:8080/neworder/"+orderItem.id, JSON.stringify(orderItem), {headers:headers});
}
}