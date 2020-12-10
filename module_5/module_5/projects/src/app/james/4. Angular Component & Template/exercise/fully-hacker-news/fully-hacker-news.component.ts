import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-fully-hacker-news',
  templateUrl: './fully-hacker-news.component.html',
  styleUrls: ['./fully-hacker-news.component.css']
})
export class FullyHackerNewsComponent implements OnInit {

  constructor() {
  }

  index =0;

  articles: [
    {
      index :1,
      title: 'Google',
      url: 'https://www.google.com/'
    },
    { index :2,
      title: 'Facebook',
      url: 'https://www.facebook.com/'}
  ];

  ngOnInit(): void {
  }

}
