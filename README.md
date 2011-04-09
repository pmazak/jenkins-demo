# Jenkins Demo
Runs Jenkins on Jetty.  
Requires Gradle.  

---
## Usage
    gradle hudson
    gradle jenkins

---
## Presentation
Get the slide deck from [skydrive](http://cid-adc7888fd558a4e8.office.live.com/self.aspx/.Public/Presentations/).

---
##Outline Notes
<base target="_blank">
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
        SMTP, only need JDK if building multiples
        First job, called -CI
        Freestyle
        Walk thru options. self-explanatory. ?'s very helpful.
        I don't have SVN, so need Git
        Main config, Plugins, checkbox, install
        Go to job options. It's not there.
        Restart server. It's there.
        plugins tangent   
            CD to where plugins are stored.
            cp git.hpi git.zip
            git.zip, jar in certain [structure](http://wiki.hudson-ci.org/display/HUDSON/Plugin+structure)
            index.[jelly](http://commons.apache.org/jelly/) is description
        git repo@  file:///D:/code/_Presentations/Hudson_Jenkins_Best_Practices/Hudson
        job options build:
            echo public class ABC {} >ABC.java 
            javac ABC.java 
            gradle clean test
        commands (ant, maven, gradle, buildr) are just calling installed versions
        show workspace, just scheduler doing work on the drive
        Poll SCM, rarely build periodically
            */15 * * * *
        but i'll put it on
            * * * * *
        goto d:\code\_Presentations\Hudson_Jenkins_Best_Practices\Hudson
        make changes, obviously nothing until commit
        script here commits a bunch of changes
        gradle commitabunch
##### Reporting plugins
  * Junit     configure:  gradle test, \*\*/test-results/\*.xml,  failing test will fail build
  * Pmd
  * Crap4j
##### Basic Plugins
  * Text-finder   configure: "Revision", search console, mark build Unstable.
  * The Continuous Integration Game
# Intermediate
  Scp plugin
  SVenton
  Email
  Templates-New job from job
  Templates-Project extension (mvn and regular, can mix 'n match)
  Promote builds
  Schedule all sorts of tasks:
   Backup its own config
   Ruby environment tests
   Tech debt
   Cuke progress
# Expert
  Post build groovy
  Jelly scripting
  CLI api
  XML api
  Programming for Hudson, plugins
  Clustering (can use individual computers)
  Cloud bee
 # Workflow Build Streams