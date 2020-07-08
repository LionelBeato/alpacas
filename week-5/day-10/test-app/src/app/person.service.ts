import { Injectable } from '@angular/core';
import { Person } from './person';
import { HttpClient } from '@angular/common/http';  
import { Observable } from 'rxjs';
import {of} from 'rxjs'; 

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  peeps:Person[] = [
    {
      name: "Joe",
      age: 34,
    },
    {
      name: "Mike",
      age: 23,
    },
  ]

  //TODO(): update this code with a proper async operation
  getPeople():Observable<Person[]>{
    return of(this.peeps);
  }

  constructor(private http: HttpClient) {

   }
}
