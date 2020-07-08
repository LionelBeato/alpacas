import { Component, OnInit } from '@angular/core';
import {
  animation, trigger, animateChild, group, state,
  transition, animate, style, query
} from '@angular/animations'; 




@Component({
  selector: 'app-animate',
  templateUrl: './animate.component.html',
  styleUrls: ['./animate.component.css'],
  animations: [
    trigger('openClose', [
        state('open', style({
        height: '200px',
        opacity: 1,
        backgroundColor: 'yellow',
      })),
      state('closed', style({
        height: '100px',
        opacity:0.5,
        backgroundColor:'green',
      })),
      transition('open => closed', [
        animate('1s')
      ]),
      transition('closed => open', [
        animate('0.5s')
      ]),
    ]),
  ],
})


export class AnimateComponent implements OnInit {

  isOpen = true;
  toggle(){
    this.isOpen = !this.isOpen;
  }


  constructor() { }

  ngOnInit(): void {
  }

}
