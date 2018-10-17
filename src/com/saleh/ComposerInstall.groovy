 #!/usr/bin/groovy

 package com.saleh;

 def execute(opts){
     stage("build"){
         sh "composer install"
     }
 }

 return this;
