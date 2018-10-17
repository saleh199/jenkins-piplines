 #!/usr/bin/groovey

 package com.saleh;

 def execute(opts){
     stage("build"){
         sh "composer install"
     }
 }

 return this;
