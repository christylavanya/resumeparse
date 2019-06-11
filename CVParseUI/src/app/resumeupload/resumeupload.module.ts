import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { ResumeuploadComponent } from './resumeupload.component';
import { ResumeRoutes } from './resumeupload.routing';
import { CommonModule } from '@angular/common';
import { ResumeService } from './resume.service';

@NgModule({
    imports: [
              CommonModule,
              RouterModule.forChild(ResumeRoutes),
              FormsModule              
        ],
          
      declarations: [ ResumeuploadComponent],
      providers: [ResumeService]
  })
  
  export class ResumeuploadModule {
  
  }
  