import type {TurboModule} from 'react-native';
import {TurboModuleRegistry} from 'react-native';

// Create type definitions for codegen
type CodegenPlacesLocation = {
  longitude: number;
  latitude: number;
  altitude: number;
  speed: number;
  accuracy: number;
};

type metadataStringMap = { [key: string]: string };

type CodegenPlacesPOI = {
  identifier: string;
  name: string;
  latitude: number;
  longitude: number;
  radius: number;
  userIsWithin: boolean;
  library: string;
  weight: number;
  metadata: metadataStringMap;
};

type CodegenPlacesGeofence = {
  identifier: string;
  latitude: number;
  longitude: number;
  radius: number;
  expirationDuration: number;
};


export interface Spec extends TurboModule {
  extensionVersion: () => Promise<string>;  

  getNearbyPointsOfInterest: (
    location: CodegenPlacesLocation, 
    limit: number
  ) => Promise<Array<CodegenPlacesPOI>>;
  
  processGeofence: (
    geofence: CodegenPlacesGeofence, 
    transitionType: number
  ) => void;
  
  getCurrentPointsOfInterest: () => Promise<Array<CodegenPlacesPOI>>;
  
  getLastKnownLocation: () => Promise<CodegenPlacesLocation>;
  
  clear: () => void;
  
  setAuthorizationStatus: (authStatus?: string) => void;
}

export default TurboModuleRegistry.getEnforcing<Spec>('AEPPlaces');
