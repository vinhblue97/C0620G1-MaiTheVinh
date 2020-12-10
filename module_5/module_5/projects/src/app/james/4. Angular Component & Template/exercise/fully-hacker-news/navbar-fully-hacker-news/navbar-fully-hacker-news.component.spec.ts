import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NavbarFullyHackerNewsComponent } from './navbar-fully-hacker-news.component';

describe('NavbarFullyHackerNewsComponent', () => {
  let component: NavbarFullyHackerNewsComponent;
  let fixture: ComponentFixture<NavbarFullyHackerNewsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NavbarFullyHackerNewsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NavbarFullyHackerNewsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
