import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from './component/home/home.component';
import {ListComponent} from './component/list/list.component';
import {PageNotFoundComponent} from './component/page-not-found/page-not-found.component';
import {CommonModule} from "@angular/common";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import {NgxPaginationModule} from 'ngx-pagination'
import {MaterialModule} from "./material.module";
import {EditComponent} from './component/edit/edit.component';
import {DeleteComponent} from './component/delete/delete.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'list', component: ListComponent},
  {path: 'edit/:id', component: EditComponent},
  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes), CommonModule, ReactiveFormsModule, Ng2SearchPipeModule, FormsModule,
    NgxPaginationModule, MaterialModule],
  exports: [RouterModule],
  declarations: [HomeComponent, ListComponent, PageNotFoundComponent, EditComponent, DeleteComponent]
})
export class AppRoutingModule {
}
