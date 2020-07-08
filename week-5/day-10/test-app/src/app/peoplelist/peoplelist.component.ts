import { Component, OnInit } from '@angular/core';
import { PersonService } from '../person.service';
import { Person } from '../person';  

@Component({
  selector: 'app-peoplelist',
  templateUrl: './peoplelist.component.html',
  styleUrls: ['./peoplelist.component.css']
})
export class PeoplelistComponent implements OnInit {

  peeps:Person[]; 
  mapped; 

  constructor(private personService: PersonService) { }

  ngOnInit(): void {
    // this.peeps = this.personService.getPeople(); 
    this.mapped = this.peeps.map(element => JSON.stringify(element));
  }

  // getPeeps(){
  //   this.personService.getPeople()
  //   .subscribe(p => this.peeps = p); 
  // }

}
