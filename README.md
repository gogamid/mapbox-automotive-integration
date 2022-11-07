# mapbox-automotive-integration
Minimal Integration of Mapbox to Automotive App of AOSP System. 
Now it is possible render Car App Library Template apps on Automotive OS without Google Services(GAS). For that, the AOSP Automotive OS should have [AOSPTemplateHost](https://source.android.com/docs/devices/automotive/hmi/aosp_host) as a system app. It will act as a replacement for Google Automotive App Host and will render our templated app. Drawback of this open-source App Host is, it does't include Google Maps as a Service, instead we have to draw our own map. Therefore I integrated third-party Map called Mapbox to the simple app and got this result:

![Screenshot_1667862474](https://user-images.githubusercontent.com/36050790/200435365-3bf345cd-75b1-41fb-8a4b-82a056695c66.png)


In order to run the project add your private and public keys to `settings.gradle` and `mapbox_access_token.xml` respectively:

<img width="701" alt="Screenshot 2022-11-08 at 00 17 29" src="https://user-images.githubusercontent.com/36050790/200435875-ccb44eec-1d0d-462c-b969-4ec78fdfd06e.png">

<img width="1163" alt="Screenshot 2022-11-08 at 00 17 59" src="https://user-images.githubusercontent.com/36050790/200435882-3f01c951-b922-4d0d-9e4e-07688d3aaf23.png">
