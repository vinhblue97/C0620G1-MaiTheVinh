import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ListComponent} from './component/list/list.component';
import {CreateComponent} from './component/create/create.component';
import {PageNotFoundComponent} from './component/page-not-found/page-not-found.component';


const routes: Routes = [
  {path: 'list', component: ListComponent},
  {path: 'create', component: CreateComponent},
  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
  declarations: [ListComponent, CreateComponent, PageNotFoundComponent]
})
export class AppRoutingModule { }
