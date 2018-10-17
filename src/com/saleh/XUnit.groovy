#!/usr/bin/groovy

package com.saleh;

def execute(opts){
    stage("xunit"){
        junit "reports/xunit";
    }
}

return this;
