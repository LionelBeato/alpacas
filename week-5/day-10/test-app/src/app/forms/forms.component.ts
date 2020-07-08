import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-forms',
  templateUrl: './forms.component.html',
  styleUrls: ['./forms.component.css']
})
export class FormsComponent implements OnInit {


  personForm = new FormGroup({
  name: new FormControl(''), 
  phone: new FormControl(''),
});

personForm2 = this.builder.group({
  name:[''],
  phone:[''],
})


  constructor(private builder: FormBuilder) { }

  showInfo(){
    alert(`Name: ${this.personForm.controls['name'].value}`);
    console.log(this.personForm.controls['name'].value); 
  }

  changeName(){
    this.personForm.controls['name'].setValue('Bobby');
    this.personForm.controls['phone'].setValue('555-555-5555'); 
  }

  ngOnInit(): void {
  }

}
