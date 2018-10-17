#!/usr/bin/groovy

package com.saleh;

def execute(opts){
    stage("checkout"){
        checkout scm
    }
}

return this;
