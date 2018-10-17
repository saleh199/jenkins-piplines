#!/usr/bin/groovy

package com.saleh;

def execute(opts){
    stage("coverage"){
        step([
            $class: "CloverPublisher",
            cloverReportDir: "reports",
            cloverReportFileName: "coverage",
            healthyTarget: [methodCoverage: opts.healthy, conditionalCoverage: opts.healthy, statementCoverage: opts.healthy],
            unhealthyTarget: [methodCoverage: opts.unhealthy, conditionalCoverage: opts.unhealthy, statementCoverage: opts.unhealthy],
            failingTarget: [methodCoverage: opts.failing, conditionalCoverage: opts.failing, statementCoverage: opts.failing]
        ])
    }
}

return this;
