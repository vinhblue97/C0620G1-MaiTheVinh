import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import { ListComponent } from './final-exam/component/list/list.component';
import { PageNotFoundComponent } from './final-exam/component/page-not-found/page-not-found.component';
import { HomeComponent } from './final-exam/component/home/home.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'list', component: ListComponent},
  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  declarations: [ListComponent, PageNotFoundComponent],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
