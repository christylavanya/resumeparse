import { Component, OnInit } from '@angular/core';
import { ResumeService } from './resume.service';

@Component({
  selector: 'app-resumeupload',
  templateUrl: './resumeupload.component.html',
  styleUrls: ['./resumeupload.component.scss']
})
export class ResumeuploadComponent implements OnInit {

  rowData:any[]=[];
  errorMessage:any;
  public show:boolean = false;

  constructor(private resumeService: ResumeService) { }

  

  ngOnInit() {
  }

  public parseResume() {
    this.show=!this.show;
    this.resumeService.parseResume()
      .subscribe(
        success => { this.rowData = success;   },
        error => { this.errorMessage = error;  });
  }

}
