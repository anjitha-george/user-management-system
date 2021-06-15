import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClientService, User } from '../service/httpClient.service';

@Component({
  selector: 'app-create-user',
  templateUrl: './create-user.component.html',
  styleUrls: ['./create-user.component.css']
})
export class CreateUserComponent implements OnInit {
  user: User = new User('','');

  constructor(
    private httpClientService: HttpClientService,
    private router: Router
  ) { }

  ngOnInit(): void {
  }
  createUser(): void{
    this.httpClientService.createUser(this.user).subscribe(date => {
      alert('User created successfully');
      this.router.navigate(['/users']);
      console.log(this.user);
    });
  }

}
