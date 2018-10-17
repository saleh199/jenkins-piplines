#!/usr/bin/groovey

package com.saleh;

def execute(opts){
    stage("checkout"){
        checkout scm
    }
}

return this;
