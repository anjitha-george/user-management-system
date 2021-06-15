import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateUserComponent } from './create-user/create-user.component';
import { UserComponent } from './user/user.component';


const routes: Routes = [
  {path:'users',component: UserComponent},
  {path:'', redirectTo:'users', pathMatch: 'full'},
  {path:'create-user',component: CreateUserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
