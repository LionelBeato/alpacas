import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mood',
  templateUrl: './mood.component.html',
  styleUrls: ['./mood.component.css']
})
export class MoodComponent implements OnInit {

  mood = "happy and content!"; 

  constructor() { }

  ngOnInit(): void {
    console.log("component initialized!"); 
  }

}
