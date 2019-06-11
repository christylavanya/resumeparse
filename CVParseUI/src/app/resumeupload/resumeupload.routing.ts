import { Routes } from '@angular/router';

import { ResumeuploadComponent } from './resumeupload.component';

export const ResumeRoutes: Routes = [
	{
	   path: '',
		  component: ResumeuploadComponent,
		  data: {
			heading: 'Resume Upload',
			removeFooter: true
		  }
	 }
];
