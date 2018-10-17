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
}

return this
