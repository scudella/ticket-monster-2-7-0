# ticket-monster
My follow-up on jboss-developer ticket-monster

This is the Introduction & Get Started branch working in Red Hat 8. See part II of the attached ticket-monster-2.7.0.Final.pdf document.

You may run it as "Run on Server" (Jboss EAD) and see the page http://localhost:8080/ticket-monster/mobile.html. You are supposed to deploy h2-console.war first. See the Deployment section of the document.

The pom.xml has been updated to be able to run the Arquillian test presented in this phase. Arquillian is introduced later in the tutorial. Just right click the test and select "Run as JUnit".
