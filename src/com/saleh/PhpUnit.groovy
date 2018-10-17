#!/usr/bin/groovy

package com.saleh;

def execute(opts){
    stage("test"){
        sh './vendor/bin/phpunit --log-junit  reports/xunit --coverage-clover reports/coverage';
    }
}

return this;
