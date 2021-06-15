import { Component, OnInit } from '@angular/core';
import { HttpClientService, User } from '../service/httpClient.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users: User[];

  constructor(
    private httpClientService: HttpClientService
  ) { }

  ngOnInit(): void {
    this.getUsers();
  }
  getUsers() {
    this.httpClientService.getUsers().subscribe(data => {
      console.log(data);
      this.users = data;
    });
  }
  deleteUser(user: User): void {
    this.httpClientService.deleteUser(user).subscribe(data => {
      console.log(data);
      this.users = this.users.filter(v => v !== user);
    });
  }
}


