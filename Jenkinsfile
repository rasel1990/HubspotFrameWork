pipeline {
    agent any
    tools{
    maven "M3"
    }
    stages{
    stage('Build'){
    steps{
        sh 'mvn clean test'
    }
  }
    stage('reports'){
    step{
        script{
            allure([
             includeProperties:false,
             jdk:'',
             properties:[],
             reportBuildPolicy:'ALWAYS',
             results:[[path:'/allure-results']]
             ])
             publishHTML([ 
             allowMissing:false,
             alwaysLinkToLastBuild:false,
             keepAll:false,
             reportDir:'build',
             reportFiles:'TestExecutionreport.html',
             reportName:'Extent HTML Report',
             reportTittles:''])
        }

    }


    
  }

}
    }