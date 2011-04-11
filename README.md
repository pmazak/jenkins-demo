<base target="_blank">
# Jenkins Demo
Runs Jenkins on Jetty.  
Requires Gradle.  

---
## First time only
    1> gradle jenkins
    (After server is up, stop the server.)
    
    2> gradle installPlugins jenkins
    
    (While server is up, from a separate console run the following.)
    3> gradle createJob

---
## Optional
    gradle commitabunch  (Use as often as you like to see code changes between builds.)

---
## Presentation
Get the slide deck from [SkyDrive](http://cid-adc7888fd558a4e8.office.live.com/self.aspx/.Public/Presentations/).

---
## Outline Notes
### Beginner
##### Hudson vs Jenkins
   * [jenkins downloads](http://mirrors.jenkins-ci.org/war/)
   * [hudson downloads](http://java.net/downloads/hudson/war/)
   * [jenkins git](http://github.com/jenkinsci)
   * [hudson git](http://github.com/hudson)  
   * [Oracle forks Jenkins](http://www.artima.com/weblogs/viewpost.jsp?thread=317610)
   * [Migration Update](http://wiki.hudson-ci.org/display/HUDSON/Java.net+migration+status+updates)
   * [Memonic opinion](http://www.memonic.com/user/chris/set/development-tools/id/1pbbi)
   * [Oracle claims trademark](http://www.theregister.co.uk/2010/12/01/oracle_owns_hudson/)
   * [Who's driving?](http://jenkins-ci.org/content/whos-driving-thing)
   * [Kohsuke Morning of lockout](http://kohsuke.org/2010/11/23/hudson-java-net-migration-status-update/)
##### Install
##### Config
##### Reporting plugins
  * Junit     configure:  gradle test, \*\*/test-results/\*.xml,  failing test will fail build
  * Pmd
  * Crap4j
##### Basic Plugins
  * Text-finder   configure: "Revision", search console, mark build Unstable.
  * Install Git, Groovy Postbuild, Promoted Builds, Email-ext, Template Project, Pipelines
# Intermediate
  * Email
  * Scp plugin
  * SVenton
  * Templates-New job from job
  * Templates-Project extension (mvn and regular, can mix 'n match)
  * Promote builds
  * Schedule all sorts of tasks:
   * Backup its own config
   * Ruby environment tests
   * Tech debt
   * Cucumber tests
# Expert
  * [Build Pipelines](http://weblogs.java.net/blog/johnsmart/archive/2011/03/10/build-pipelines-jenkinshudson)
  * Post build groovy
  * XML api
  * CLI api
  * Writing plugins for Hudson
   * [Maven create plugin](http://wiki.hudson-ci.org/display/HUDSON/Plugin+tutorial)
   * [Plugin structure](http://wiki.hudson-ci.org/display/HUDSON/Plugin+structure)
   * Jelly scripting
  * Clustering (can use individual computers)
  * Cloudbees
