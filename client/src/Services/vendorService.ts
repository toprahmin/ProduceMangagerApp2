import { Http, Response, Headers, RequestOptions } from '@angular/http';
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';
import {Injectable} from '@angular/core';

@Injectable()
export class VendorService{
    constructor(private _http:Http){}

getAllVendors(): Observable<any>{
    return this._http.get("http://localhost:8080/vendor/")
    .map(response => response.json());
}

postVendor(vendor: any): Observable<any>{
    let headers = new Headers();
    headers.append('Content-Type', 'application/json');
    return this._http.post("http://localhost:8080/vendor/", JSON.stringify(vendor), {headers:headers});
}

deleteVendor(id:Number): Observable<any>{
    return this._http.delete("http://localhost:8080/vendor/"+id);
}

updateVendor(vendor:any): Observable<any>{
    let headers = new Headers();
    headers.append('Content-Type', 'application/json');
    return this._http.put("http://localhost:8080/vendor/"+vendor.id, JSON.stringify(vendor), {headers:headers});
    }
}