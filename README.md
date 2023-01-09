# MovieApp

## Authors:

  * Krzysztof Książek 34301
  * Daniel Sikora     34326
  * Adrian Ciochoń	  34275 

## Installation

After download app you must change path to uploads in application-prod.yml.

```
  web:
    resources:
      static-locations: classpath:/static/,file:C:\Users\Daniel\Documents\TOiK\MovieApp\uploads
  app:
    storage:
     !location: C:\Users\Daniel\Documents\TOiK\MovieApp\uploads
```