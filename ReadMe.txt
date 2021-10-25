Hello,

The following test was made with intellij, so I packaged the whole thing if you want to open or edit it.

Simply double clicking the jar AtexoTechnicalTest/springpack/target/springpack-0.0.1-SNAPSHOT.jar will launch the program, then go to localhost:8080 in a webbrowser.

The main page should have the different route listed :
/		just guidelines
/showHand	show an unsorted card hand based on a strength order defined on the first 			get request from showHand, refreshing the page will give you a new hand
/sortedHand	sort and show the card hand that you got with showHand 
/reset		reset the strength order and randomize a new one

I'm quite new to springboot so the visual part is just a json format, the card class could be updated to allow for an image field that would be printed.

Another improvment could be to have a sort button on the showHand page that would give the sortedHand result without having to manually type the url.

There probably could be more to be done with the unit testing too but as stated above I am unfamiliar with how all of it works with springboot.

I'll take any advice/critiscism you can throw my way :)
