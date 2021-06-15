import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

export class User{
  constructor(
    public name: string,
    public age: string
  ){}
}
@Injectable({
  providedIn: 'root'
})

export class HttpClientService {
  private baseURL = 'http://localhost:8081/users';
  constructor(
    private httpClient: HttpClient
  ) { }
  getUsers() {
    return this.httpClient.get<User[]>(`${this.baseURL}`);
  }
  deleteUser(user){
    return this.httpClient.delete<User>(`${this.baseURL}/${user.name}`);
  }
  createUser(user){
    return this.httpClient.post<User>(`${this.baseURL}`,user);
  }
}
