#!/usr/bin/env groovy

package com.saleh;

def run(Object step, opts){
    try{
        if(opts){
            step.execute(opts)
        }else{
            step.execute()
        }
    }catch(err){
        currentBuild.result = "FAILURE"
        echo "Build Failed"
    }
}

def execute(projectName){
    this.run(new Checkout(), null);
    this.run(new ComposerInstall(), null);

    stage("create-env-keys"){
        sh "cp .env.example .env";
        sh "php artisan key:generate";
    }

    this.run(new PhpUnit(), null);
    this.run(new XUnit(), null);
    this.run(new Coverage(), [healthy: 80, unhealthy: 50, failing: 0]);


}

return this
