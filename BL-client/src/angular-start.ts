import {bootstrap} from 'angular2/platform/browser';
import {BLComponent} from './classes/angular-components/bl/bl';
import {ServerService} from './classes/angular-services/server-service';

bootstrap(BLComponent, [ServerService]);
