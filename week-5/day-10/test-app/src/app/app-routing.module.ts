import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MoodComponent } from './mood/mood.component';


const routes: Routes = [
  {path: 'mood', component: MoodComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
