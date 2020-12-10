import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FooterFullyHackerNewsComponent } from './footer-fully-hacker-news.component';

describe('FooterFullyHackerNewsComponent', () => {
  let component: FooterFullyHackerNewsComponent;
  let fixture: ComponentFixture<FooterFullyHackerNewsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FooterFullyHackerNewsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FooterFullyHackerNewsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
