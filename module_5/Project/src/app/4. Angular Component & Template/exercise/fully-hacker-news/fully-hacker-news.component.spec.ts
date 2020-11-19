import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FullyHackerNewsComponent } from './fully-hacker-news.component';

describe('FullyHackerNewsComponent', () => {
  let component: FullyHackerNewsComponent;
  let fixture: ComponentFixture<FullyHackerNewsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FullyHackerNewsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FullyHackerNewsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
