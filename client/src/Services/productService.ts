import { Http, Response, Headers, RequestOptions } from '@angular/http';
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';
import {Injectable} from '@angular/core';

@Injectable()
export class ProductService{
    constructor(private _http:Http){

    }

    getAllProducts(): Observable<any>{
        return this._http.get("http://localhost:8080/products/")
        .map(response => response.json());
    }

    postProduct(product: any): Observable<any>{
        let headers = new Headers();
        headers.append('Content-Type', 'application/json');
        return this._http.post("http://localhost:8080/products/", JSON.stringify(product),{headers:headers});
    }

    deleteProduct(id:Number): Observable<any>{
        return this._http.delete("http://localhost:8080/products/"+id);
    }

    updateProduct(product: any): Observable<any>{
        let headers = new Headers();
        headers.append('Content-Type', 'applicaton/json');
        return this._http.put("http://localhost:8080/products/"+product.id, JSON.stringify(product), {headers:headers});
    }
}